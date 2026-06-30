package Hard;
// https://leetcode.com/problems/first-missing-positive/description/

class TestCase_41{
    int[] nums;
    TestCase_41(int[] nums){
        this.nums=nums;
    }
}
public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        TestCase_41 test1 = new TestCase_41(new int[]{1, 2, 0});
        TestCase_41 test2 = new TestCase_41(new int[]{3, 4, -1, 1});
        TestCase_41 test3 = new TestCase_41(new int[]{7, 8, 9, 11, 12});

        System.out.println("Case1 Solution: " + firstMissingPositive(test1.nums));
        System.out.println("Case2 Solution: " + firstMissingPositive(test2.nums));
        System.out.println("Case3 Solution: " + firstMissingPositive(test3.nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
