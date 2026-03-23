package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Contain_Duplicate {
    public static void main(String[] args) {
        Contain_Duplicate ob = new Contain_Duplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean conDup = ob.containsDuplicate(nums);
        System.out.println(conDup);
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int j=1;j< nums.length;j++){
            if(nums[j]==nums[j-1]) {
                return true;
            }
        }
        return false;
    }
}
