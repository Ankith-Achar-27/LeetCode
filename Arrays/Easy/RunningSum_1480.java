package Easy;

import java.util.Arrays;

public class RunningSum_1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));

    }
    public static int[] runningSum(int[] nums){

        // Initial complexity: O(n^2)

       /* int[] run = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            run[i]=sum(nums,i);
        }
        return run;*/

        // Time complexity: O(n)
        for (int i=1;i< nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
/*    static int sum(int[] nums,int index){
        int sum=0;
        for (int k=0;k<=index;k++){
            sum+=nums[k];
        }
        return sum;
    }*/
}
