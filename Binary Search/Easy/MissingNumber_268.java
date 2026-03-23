package Easy;

import java.util.Arrays;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        MissingNumber_268 obj = new MissingNumber_268();
        System.out.println(obj.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end = nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==mid) start=mid+1;
            else end =mid-1;
        }
    return start;
    }
}


