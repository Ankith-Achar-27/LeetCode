package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class NumbSmallerThanCurrNumb_1365 {
    public static void main(String[] args) {
        int[] num1 = {8,1,2,2,3};
        int[] num2 = {6,5,4,8};
        int[] num3 = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(num1)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(num2)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(num3)));


    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int n= nums.length;
        int[] temp = Arrays.copyOf(nums,n);

        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i< temp.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],i);
            }
        }
        for (int j=0;j<n;j++){
            if(map.containsKey(nums[j])){
                nums[j]=map.get(nums[j]);
            }
        }
        return nums;
    }
}
