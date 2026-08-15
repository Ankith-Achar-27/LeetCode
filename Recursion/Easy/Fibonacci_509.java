package Easy;

public class Fibonacci_509 {
    public static void main(String[] args) {
        int[] num = {2,3,4};
        for(int n:num){
            System.out.println(fib(n));
        }
    }
    static int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
