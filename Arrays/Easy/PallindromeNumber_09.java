package Easy;

public class PallindromeNumber_09 {
    public static void main(String[] args) {
        PallindromeNumber_09 obj = new PallindromeNumber_09();
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
