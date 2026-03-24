package Medium;

public class Search2DMatrix2_240 {
    static void main(String[] args) {
        int[][] arr ={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        Search2DMatrix2_240 obj = new Search2DMatrix2_240();
        System.out.println(obj.searchMatrix(arr,20));

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
