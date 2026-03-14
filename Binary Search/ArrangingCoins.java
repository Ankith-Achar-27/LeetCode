public class ArrangingCoins {
    public static void main(String[] args) {
        int n=1804289383;
        ArrangingCoins obj = new ArrangingCoins();
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
