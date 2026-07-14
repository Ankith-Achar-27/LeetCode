package Easy;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        ValidPerfectSquare_367 obj = new ValidPerfectSquare_367();
        System.out.println(obj.isPerfectSquare(5));
    }
    public boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid==(double)num/mid){
                return true;
            } else if (mid<num/mid) {
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return false;

    }
}
