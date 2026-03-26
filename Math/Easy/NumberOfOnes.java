
public class NumberOfOnes {
    static void main() {
        int n=128;
        NumberOfOnes obj = new NumberOfOnes();
        System.out.println(obj.hammingWeight(n));
    }
    public int hammingWeight(int n) {
        int one=0;
        while(n!=0){
            one+=(n&1);
            n=n>>>1;
        }
        return one;
    }
}
