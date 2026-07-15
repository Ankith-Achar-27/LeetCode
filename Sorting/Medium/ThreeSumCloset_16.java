package Medium;

import java.util.Arrays;

public class ThreeSumCloset_16 {
    public static void main(String[] args) {

        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4},1));
        System.out.println(threeSumClosest(new int[]{0,0,0},1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2];

        for (int first=0;first< nums.length-2;first++){
            int start = first+1;
            int end = nums.length-1;

            while (start<end){
                int sum = nums[first]+nums[start]+nums[end];
                if(Math.abs(sum-target) < Math.abs(close-target)){
                    close = sum;
                }
                if(sum<target){
                    start++;
                }
                else if(sum > target) {
                    end--;
                }
                else {
                    return sum;
                }
            }
        }
        return close;
    }
}
