package Medium;

public class Search2DMatrix_74 {
    public static void main(String[] args) {
        Search2DMatrix_74 obj = new Search2DMatrix_74();
        int[][] arr={
                {1,3,5,7},
                {10,20,30,40},
                {50,60,70,80}
        };
        System.out.println(obj.searchMatrix(arr,60));

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col= matrix[0].length-1;

        while (row< matrix.length && col>=0){
            if (matrix[row][col]==target){
                return true;
            } else if (matrix[row][col]<target) {
                row++;
            }
            else {
                col--;
            }
        }

        return false;
    }
}
