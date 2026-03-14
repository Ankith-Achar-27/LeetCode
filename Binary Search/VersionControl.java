class VersionControl2 {


    int firstBad = 4;

    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

class Solution extends VersionControl2 {

    public int firstBadVersion(int n) {
        int start=1;
        int end = n;
        while(start<end){
            int mid = start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            }
            else
                start=mid+1;
        }
        return start;
    }
}

public class VersionControl {

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.firstBadVersion(1));
    }
}