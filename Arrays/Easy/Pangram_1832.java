package Easy;

import java.util.HashSet;

public class Pangram_1832 {
    public static void main(String[] args) {
        String s1 = "thequickbrownfoxjumpsoverthelazydog";
        String s2 = "leetcode";

        System.out.println(checkIfPangram(s1));
        System.out.println(checkIfPangram(s2));

    }
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
            if (set.size()==26){
                return true;
            }
        }
        return false;
    }
}
