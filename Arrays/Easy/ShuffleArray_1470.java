package Easy;

import java.util.Arrays;

public class ShuffleArray_1470 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
        System.out.println(Arrays.toString(shuffle(new int[]{1,1,2,2}, 2)));


    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int k=0;
/*      int i=0;
        int j=n;
        int k=0;

        while(k< ans.length){
            if (k%2==0){
                ans[k++]=nums[i++];
            }
            else {
                ans[k++]=nums[j++];
            }
        }
*/
        for (int i=0;i< n;i++){
            ans[k++]=nums[i];
            ans[k++]=nums[i+n];
        }

        return ans;
    }
}
