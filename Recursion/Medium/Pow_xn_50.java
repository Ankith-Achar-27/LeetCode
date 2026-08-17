package Medium;

public class Pow_xn_50 {
    public static void main(String[] args) {
        double ans = myPow(2.00000,-2);
        System.out.println(ans);
    }
    static double myPow(double x, int n) {
        long exp = n;
        if(exp<0){
            return 1/helper(x,-exp);
        }
        return helper(x,exp);
    }
    static double helper(double x, long n){
        if(n==0){
            return 1;
        }

        double half = Math.pow(x,n/2);

        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    }
}

