package Easy;

public class PowerOfFour_342 {
    public static void main(String[] args) {
        int[] num = {16,5,1};
        for (int n:num){
            System.out.println(isPowerOfFour(n));
        }
    }
    static boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        while (n>1 && n%4==0){
            n=n/4;
        }
        return n==1;
    }
}
