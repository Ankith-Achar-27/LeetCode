package Easy;

import java.util.Arrays;

class MoveZeroesTestCase{
    int[] nums;
    MoveZeroesTestCase(int[] nums){
        this.nums=nums;
    }
}

public class MoveZeroes_283 {
    public static void main(String[] args) {
        MissingNumberTestCase test1 = new MissingNumberTestCase(new int[]{0, 1, 0, 3, 12});
        MissingNumberTestCase test2 = new MissingNumberTestCase(new int[]{1,0,1});
        MissingNumberTestCase test3 = new MissingNumberTestCase(new int[]{0});

        moveZeroes(test1.nums);
        System.out.println("Test Case1 result: " + Arrays.toString(test1.nums));
        moveZeroes(test2.nums);
        System.out.println("Test Case2 result: " + Arrays.toString(test2.nums));
        moveZeroes(test3.nums);
        System.out.println("Test Case3 result: " + Arrays.toString(test3.nums));
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

