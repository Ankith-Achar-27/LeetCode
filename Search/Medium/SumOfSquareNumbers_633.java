package Medium;

// target c is given return true if c = a^2 + b^2
class TestCase_633{
    int num;
    TestCase_633(int c){
        this.num=c;
    }
}
public class SumOfSquareNumbers_633 {
    public static void main(String[] args) {
        TestCase_633 test1 = new TestCase_633(5);
        TestCase_633 test2 = new TestCase_633(3);
        TestCase_633 test3 = new TestCase_633(2147483646);


        System.out.println("TestCase1 Solution: " + judgeSquareSum(test1.num));
        System.out.println("TestCase2 Solution: " + judgeSquareSum(test2.num));
        System.out.println("TestCase2 Solution: " + judgeSquareSum(test3.num));
    }

    //    Approach : Two pointer method
    static boolean judgeSquareSum(int c) {
        long start=0;
        long end = (int)Math.sqrt(c);
        while (start<=end){
            long sum = start*start + end*end;
            if(sum==c){
                return true;
            }
            if(sum<c){
                start++;
            }
            else{
                end--;
            }

        }
        return false;
    }
}
