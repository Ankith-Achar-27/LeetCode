package Medium;

import java.util.Arrays;

class TestCase{
    int[] num;
    TestCase(int[] nums){
        this.num=nums;
    }
}
public class SortColors_75 {
    public static void main(String[] args) {
        TestCase test1 = new TestCase(new int[]{2,0,2,1,1,0});
        TestCase test2 = new TestCase(new int[]{2,0,1});
        TestCase test3 = new TestCase(new int[]{1,1,0,2,0,2});
        TestCase test4 = new TestCase(new int[]{1,0});


        sortColors(test1.num);
        System.out.println("Test Case1 solution: "+ Arrays.toString(test1.num));
        sortColors(test2.num);
        System.out.println("Test Case2 solution: "+ Arrays.toString(test2.num));
        sortColors(test3.num);
        System.out.println("Test Case3 solution: "+ Arrays.toString(test3.num));
        sortColors(test4.num);
        System.out.println("Test Case4 solution: "+ Arrays.toString(test4.num));
    }
    static void sortColors(int[] nums) {
        if(nums.length<2){
            return;
        }
        int start=0;
        int mid=0;
        int end= nums.length-1;
        while (mid<=end){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,mid,start);
                start++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,end);
                end--;
            }
        }
    }
    static int[] swap(int[] nums,int num1,int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
        return nums;
    }
}
