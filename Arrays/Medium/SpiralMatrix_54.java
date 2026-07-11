package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        int[][] matrix2 ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};

        System.out.println(spiralOrder(matrix1));
        System.out.println(spiralOrder(matrix2));

    }
    public static List<Integer> spiralOrder(int[][]matrix){
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;

        List<Integer> ans = new ArrayList<>();

        while (top<=bottom && left<=right){
            // top
            for (int i = left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // right
            for (int j=top;j<=bottom;j++){
                ans.add(matrix[j][right]);
            }
            right--;

           // bottom
           if(top<=bottom){
               for (int k=right;k>=left;k--){
                   ans.add(matrix[bottom][k]);
               }
               bottom--;
           }
            // left
           if (left<=right){
               for (int p=bottom;p>=top;p--){
                    ans.add(matrix[p][left]);
                }
               left++;
           }
        }
        return ans;
    }
}
