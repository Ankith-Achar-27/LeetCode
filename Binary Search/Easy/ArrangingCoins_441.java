package Easy;

public class ArrangingCoins_441 {
    public static void main(String[] args) {
        int n=1804289383;
        ArrangingCoins_441 obj = new ArrangingCoins_441();
        System.out.println(obj.arrangeCoins(n));
    }
    public int arrangeCoins(int n) {
        int ans=0;
        int start =1;
        int end=n;

        while(start<=end){
            int mid=start+(end-start)/2;
            long count= ((long)mid*(long)(mid+1))/2;
            if(count<=n){
                ans=mid;
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
