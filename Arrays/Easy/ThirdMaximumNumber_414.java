package Easy;

import java.util.Arrays;

public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {

        System.out.println("case1 solution: "+ thirdMax(new int[]{3,2,1}));
        System.out.println("case2 solution: "+ thirdMax(new int[]{1,2}));
        System.out.println("case3 solution: "+ thirdMax(new int[]{2,2,3,1}));

    }
    public static int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int n:nums){
            if (n>max1){
                max3=max2;
                max2=max1;
                max1=n;
            }
            else if (max1>n && n>max2) {
                max3=max2;
                max2=n;
            }
            else if (max2>n && n>max3) {
                max3=n;
            }
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;

    }
}
