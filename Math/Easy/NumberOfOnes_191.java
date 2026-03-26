public class NumberOfOnes_191 {
    static void main() {
        int n=11;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int one=0;
        while(n!=0){
            one+=(n&1);
            n=n>>>1;
        }
        return one;
    }
}
