package Easy;

import java.util.Arrays;

class TestCase_905 {
    int [] nums;
    TestCase_905(int[] nums){
        this.nums=nums;
    }
}
public class SortByParity_905 {
    public static void main(String[] args) {
        TestCase_905 test1 = new TestCase_905(new int[] {3,1,2,4});
        TestCase_905 test2 = new TestCase_905(new int[]{0});

        System.out.println("Test1 : "+Arrays.toString(sortArrayByParity(test1.nums)));
        System.out.println("Test2 :"+Arrays.toString(sortArrayByParity(test2.nums)));

    }
    public static int[] sortArrayByParity(int[] nums) {
        for (int i=0,j=0;j< nums.length;j++){
            if ((nums[j]&1)==0){
                swap(nums,i,j);
                i++;
            }
        }
        return nums;

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
