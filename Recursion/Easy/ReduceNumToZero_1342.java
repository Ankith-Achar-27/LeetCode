package Easy;

public class ReduceNumToZero_1342 {
    static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int n , int c){
        if(n == 0){
            return c;
        }
        if(n%2 == 0){
            return helper(n/2,c+1);
        }
        else {
            return helper(n-1,c+1);
        }

    }
    public static void main(String[] args) {
        int[] testCases = {14, 8, 123};

        for (int n : testCases) {
            System.out.println("Steps for " + n + ": " + numberOfSteps(n));
        }
    }

}
