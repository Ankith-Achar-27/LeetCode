package Easy;

import java.util.Arrays;

public class TwoSum_01 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        TwoSum_01 obj = new TwoSum_01();
        System.out.println(Arrays.toString(obj.twoSum(nums,9)));
    }
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]+nums[i]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
