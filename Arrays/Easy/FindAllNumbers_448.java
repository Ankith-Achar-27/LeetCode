package Easy;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;


class TestCase_448{
    int[] nums;
    TestCase_448(int[] nums){
        this.nums=nums;
    }
}

public class FindAllNumbers_448 {
    public static void main(String[] args) {
        TestCase_448 test1 = new TestCase_448(new int[]{4,3,2,7,8,2,3,1});
        TestCase_448 test2 = new TestCase_448(new int[]{1,1});

        System.out.println("Test Case1 solution: "+findDisappearedNumbers(test1.nums));
        System.out.println("Test Case2 solution: "+findDisappearedNumbers(test2.nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int index=0;index< nums.length;index++){
            if(nums[index]!=index+1){
                answer.add(index + 1);
            }
        }
        return answer;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
