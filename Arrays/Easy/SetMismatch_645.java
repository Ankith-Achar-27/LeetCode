package Easy;
//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

class TestCase_645{
    int[] nums;
    TestCase_645(int[] nums){
        this.nums = nums;
    }
}

public class SetMismatch_645 {
    public static void main(String[] args) {

        TestCase_645 test1 = new TestCase_645(new int[]{1,2,2,4});
        TestCase_645 test2 = new TestCase_645(new int[]{1,1});

        System.out.println("Case1 Solution: "+ Arrays.toString(findErrorNums(test1.nums)));
        System.out.println("Case2 Solution: "+ Arrays.toString(findErrorNums(test2.nums)));

    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int index=0;index< nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{};

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
