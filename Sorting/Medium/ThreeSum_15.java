package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4})); // {-4,-1,-1,0,1,2}
        System.out.println(threeSum(new int[]{0,1,1}));
        System.out.println(threeSum(new int[]{0,0,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int firstNum=0;firstNum< nums.length-2;firstNum++){

            if(firstNum >0 && nums[firstNum]==nums[firstNum-1]){
                continue;
            }

            int start=firstNum+1;
            int end= nums.length-1;
            while (start<end){
                int sum = nums[firstNum]+nums[start]+nums[end];

                if( sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[firstNum]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);

                    list.add(temp);

                    start++;
                    end--;

                    while (start < end && nums[start]==nums[start-1]){
                        start++;
                    }
                    while (start < end && nums[end]==nums[end+1] ){
                        end--;
                    }
                }
                else if(sum < 0){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return list;
    }
}
