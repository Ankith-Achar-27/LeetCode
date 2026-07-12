package Medium;

import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZero_73 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] mat2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(mat1);
        System.out.println(Arrays.deepToString(mat1));
        setZeroes(mat2);
        System.out.println(Arrays.deepToString(mat2));

    }

    // APPROACH: 1

//    Time Complexity: O(m × n) Space Complexity: O(m + n)
/*
    public static void setZeroes(int[][] matrix){
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int i = 0;i< matrix.length;i++){
            for (int j = 0; j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int r : row){
            for (int n=0;n< matrix[0].length;n++){
                matrix[r][n]=0;
            }
        }
        for (int c : col){
            for (int m=0;m<matrix.length;m++){
                matrix[m][c]=0;
            }
        }
    }*/

    // APPROACH: 2

//    Time Complexity: O(m × n)
//    Space Complexity: O(1)
public static void setZeroes(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;

    boolean firstRowZero = false;
    boolean firstColZero = false;

    for (int i=0;i< col;i++){
        if(matrix[0][i]==0){
            firstRowZero=true;
            break;
        }
    }
    for (int j=0;j< row;j++){
        if(matrix[j][0]==0){
            firstColZero=true;
            break;
        }
    }

    for (int r=1;r< row;r++){
        for (int c=1;c< col;c++){
            if(matrix[r][c]==0){
                matrix[r][0]=0;
                matrix[0][c]=0;
            }
        }
    }

    for (int r=1;r<row;r++){
        if (matrix[r][0]==0){
            for (int c=1;c<col;c++){
                matrix[r][c]=0;
            }
        }
    }
    for (int c=1;c<col;c++){
        if (matrix[0][c]==0){
            for (int r=1;r<row;r++){
                matrix[r][c]=0;
            }
        }
    }
    if (firstRowZero){
        for (int c=0;c<col;c++){
            matrix[0][c]=0;
        }
    }
    if (firstColZero){
        for (int r=0;r<row;r++){
            matrix[r][0]=0;
        }
    }
}
}
