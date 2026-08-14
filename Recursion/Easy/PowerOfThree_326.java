package Easy;

public class PowerOfThree_326 {
    public static void main(String[] args) {
        int[] num = {27,0,-1};
        for (int n:num){
            System.out.println(isPowerOfThree(n));
        }
    }
    static boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3==0){
            return isPowerOfThree(n/3);
        }
        return false;
    }
}
