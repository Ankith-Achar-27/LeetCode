package Easy;

import java.util.Arrays;

class TestCase{
    int[] nums;
    TestCase(int[] nums){
        this.nums=nums;
    }
}

public class MoveZeroes_283 {
    public static void main(String[] args) {
        TestCase test1 = new TestCase(new int[]{0, 1, 0, 3, 12});
        TestCase test2 = new TestCase(new int[]{1,0,1});
        TestCase test3 = new TestCase(new int[]{0});

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

