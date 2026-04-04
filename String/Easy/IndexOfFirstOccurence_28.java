public class IndexOfFirstOccurence_28 {
    static void main() {
        String haystack = "sadbutsad";
        String needle = "sad";
        IndexOfFirstOccurence_28 obj = new IndexOfFirstOccurence_28();
        System.out.println(obj.strStr(haystack,needle));
    }
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i=0,j=m;j<=n;i++,j++){
            if (haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
