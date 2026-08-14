package Easy;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        int[] num = {1,16,3,1073741825};
        for (int n:num){
            System.out.println(isPowerOfTwo(n));
        };
    }
    static boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        return false;
    }

}
