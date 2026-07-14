package Easy;

public class CountNegativeNum_1351 {
    public static void main(String[] args) {
        int[][] g1 = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] g2 = {{3,2},{1,0}};
        System.out.println(countNegatives(g1));
        System.out.println(countNegatives(g2));

    }
    public static int countNegatives(int[][] grid) {
/*        int count=0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;*/
        int ans=0;
        int row = grid.length;
        for (int i=0;i<row;i++){
            ans+= binarySearch(grid[i]);
        }
        return ans;
    }
    static int binarySearch(int[] row){
        int firstNegative = row.length;
        int start =0;
        int end = row.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] < 0) {
                firstNegative = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return row.length - firstNegative;
    }
}
