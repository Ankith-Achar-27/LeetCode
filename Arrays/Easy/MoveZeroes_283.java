package Easy;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        if(nums.length<2){
            return;
        }
        int i=0;
        int j=0;
        int temp;
        while (j< nums.length){
            if(nums[j]!=0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }
}

