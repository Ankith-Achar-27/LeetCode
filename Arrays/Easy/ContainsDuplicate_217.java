package Easy;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 1};
        int[] n2 = {1, 2, 3, 4};
        int[] n3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(n1));
        System.out.println(containsDuplicate(n2));
        System.out.println(containsDuplicate(n3));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                return true;
            }
        }
        return false;
    }
}
