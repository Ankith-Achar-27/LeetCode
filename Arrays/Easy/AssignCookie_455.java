package Easy;
// https://leetcode.com/problems/assign-cookies/submissions/2060299026/

import java.util.Arrays;

public class AssignCookie_455 {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1,2,3}));
    }
    public static int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length-1;
        int j = s.length-1;
        int content=0;
        while(i>=0 && j>=0){
            if (s[j]>=g[i]){
                content+=1;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return content;
    }
}
