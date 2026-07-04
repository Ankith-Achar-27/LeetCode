package Easy;

import java.util.Arrays;

class TestCase_922 {
    int [] nums;
    TestCase_922(int[] nums){
        this.nums=nums;
    }
}
public class SortByParity2_922 {
    public static void main(String[] args) {
        TestCase_922 test1 = new TestCase_922(new int[] {4,2,5,7});
        TestCase_922 test2 = new TestCase_922(new int[]{2,3});

        System.out.println("Test1 : "+Arrays.toString(sortArrayByParity(test1.nums)));
        System.out.println("Test2 :"+Arrays.toString(sortArrayByParity(test2.nums)));

    }
    public static int[] sortArrayByParity(int[] nums) {

        int i=0;
        int j=1;

        while (i< nums.length && j< nums.length){
            if((nums[i]&1)==0){
                i+=2;
            } else if ((nums[j]&1)==1) {
                j+=2;
            }
            else{
                swap(nums,i,j);
                i+=2;
                j+=2;
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

