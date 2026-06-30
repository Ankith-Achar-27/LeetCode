import java.util.Arrays;

class ReverseStringTestCase {
    char[] str;
    ReverseStringTestCase(char[] s){
        this.str=s;
    }
}

public class ReverseString_344 {
    public static void main(String[] args) {
        ReverseStringTestCase test1 = new ReverseStringTestCase(new char[]{'h', 'e', 'l', 'l', 'o'});
        ReverseStringTestCase test2 = new ReverseStringTestCase(new char[]{'H', 'a', 'n', 'n', 'a','h'});

        reverseString(test1.str);
        System.out.println("Test Case1 Solution: "+ Arrays.toString(test1.str));
        reverseString(test2.str);
        System.out.println("Test Case2 Solution: "+ Arrays.toString(test2.str));


    }
    static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while (start<=end){
            swap(s,start,end);
            start++;
            end--;
        }

    }
    static char[] swap(char[] s,int n1,int n2){
        char temp = s[n1];
        s[n1]=s[n2];
        s[n2]=temp;
        return s;
    }
}
