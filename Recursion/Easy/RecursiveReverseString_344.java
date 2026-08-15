package Easy;

public class RecursiveReverseString_344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
    static void reverseString(char[] s) {
         helper(s,0,s.length-1);
    }
    static void helper (char[] s,int start,int end){
        if(start>=end){
            return;
        }
        if(s[start]!=s[end]){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
        helper(s, start + 1, end - 1);
    }
}
