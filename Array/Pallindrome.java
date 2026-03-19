import java.util.Arrays;

public class Pallindrome {
    public static void main(String[] args) {
        Pallindrome obj = new Pallindrome();
        System.out.println(obj.isPallindrome(-121));
    }
    public boolean isPallindrome(int x){
        if(x<0){
            return false;
        }
        int temp=x;
        int rem;
        int rev=0;
        while (x!=0){
            rem=x%10;
            rev = rev*10+rem;
            x=x/10;
        }
        return temp==rev;
    }
}
