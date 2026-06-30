package Medium;

import java.util.Arrays;

//public class FindDuplicate_287 {
//    public static void main(String[] args) {
//        int[] nums = {1,3,4,2,2};
//        FindDuplicate_287 obj = new FindDuplicate_287();
//        System.out.println(obj.findDuplicate(nums));
//    }
//    //Time complexity: O(n log(n))
//    public int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i< nums.length;i++){
//            if(i>0 && nums[i]==nums[i-1]){
//                return nums[i];
//            }
//        }
//        return -1;
//        }
//    }

//https://leetcode.com/problems/find-the-duplicate-number/description/

// Using Cycle Sort to reduce run time
class TestCase_287{
    int[] nums;
    TestCase_287(int[] nums){
        this.nums=nums;
    }
}

public class FindDuplicate_287{
    public static void main(String[] args) {
        TestCase_287 test1 = new TestCase_287(new int[]{1,3,4,2,2});
        TestCase_287 test2 = new TestCase_287(new int[]{3,1,3,4,2});
        TestCase_287 test3 = new TestCase_287(new int[]{3,3,3,3,3});

        System.out.println("Case1 Solution: "+ findDuplicate(test1.nums));
        System.out.println("Case2 Solution: "+ findDuplicate(test2.nums));
        System.out.println("Case3 Solution: "+ findDuplicate(test3.nums));

    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct=nums[i];
            if(nums[i]< nums.length && nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for (int index=0;index< nums.length;index++){
            if(nums[index]!=index+1){
                return nums[index];
            }
        }
        return 0;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

