package Medium;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
        System.out.println(Arrays.deepToString(generateMatrix(1)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int top = 0;
        int bottom = ans.length-1;
        int right = ans[0].length-1;
        int left = 0;
        int num = 1;

          while (top<=bottom && left<=right){
            // top
            for (int i = left;i<=right;i++){
                ans[top][i]=num++;
            }
            top++;

            // right
            for (int j=top;j<=bottom;j++){
                ans[j][right]=num++;
            }
            right--;

            // bottom
            if(top<=bottom){
                for (int k=right;k>=left;k--){
                    ans[bottom][k]=num++;
                }
                bottom--;
            }
            // left
            if (left<=right){
                for (int p=bottom;p>=top;p--){
                    ans[p][left]=num++;
                }
                left++;
            }
        }
        return ans;
    }
}
