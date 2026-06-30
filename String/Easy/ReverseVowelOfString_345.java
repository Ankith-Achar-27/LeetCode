class ReverseVowelOfStringTestCase {
    String s;
    ReverseVowelOfStringTestCase(String s){
        this.s=s;
    }
}

public class ReverseVowelOfString_345 {
    public static void main(String[] args) {
        ReverseVowelOfStringTestCase test1 = new ReverseVowelOfStringTestCase(new String("IceCreAm"));
        ReverseVowelOfStringTestCase test2 = new ReverseVowelOfStringTestCase(new String("leetcode"));

        System.out.println("Test1 Solution: "+reverseVowels(test1.s));
        System.out.println("Test2 Solution: "+reverseVowels(test2.s));

    }
    static String reverseVowels(String s) {

        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==('A'|'a'|'E'|'e'|'I'|'i'|'O'|'o'|'U'|'u') &&
                    s.charAt(end)==('A'|'a'|'E'|'e'|'I'|'i'|'O'|'o'|'U'|'u')){
                swap(s,start,end);
                start++;
                end--;
            } else if (s.charAt(start)!=('A'|'a'|'E'|'e'|'I'|'i'|'O'|'o'|'U'|'u')) {
                start++;
            }
            else if (s.charAt(end)!=('A'|'a'|'E'|'e'|'I'|'i'|'O'|'o'|'U'|'u')) {
                end--;
            }
        }
        return s;

    }
    static String swap(String s,int n1,int n2){
        StringBuilder sb = new StringBuilder(s);

        char temp = sb.charAt(n1);
        sb.setCharAt(n1, sb.charAt(n2));
        sb.setCharAt(n2, temp);

        return sb.toString();
    }
}
