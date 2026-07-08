package Easy;

import java.util.Arrays;

public class MaximumProduct_628 {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{1, 2, 3,4}));
        System.out.println(maximumProduct(new int[]{-1, -2, -3}));
        System.out.println(maximumProduct(new int[]{-4, -2, 1, 2, 3}));

    }
    public static int maximumProduct(int[] nums){
/*        Arrays.sort(nums);
        int n = nums.length;
        int product1=1;
        int product2=1;

        product1=nums[n-1]*nums[n-2]*nums[n-3];
        product2=nums[0]*nums[1]*nums[n-1];

        return Integer.max(product1,product2);*/

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n: nums){
            if (n>=max1){
                max3=max2;
                max2=max1;
                max1=n;
            } else if (n>=max2) {
                max3=max2;
                max2=n;
            } else if(n>=max3){
                max3=n;
            }

            if (n<=min1){
                min2=min1;
                min1=n;
            }
            else if (n<=min2){
                min2=n;
            }
        }

        int product1=max1*max2*max3;
        int product2 = min1*min2*max1;

        return Integer.max(product1,product2);
    }
}
