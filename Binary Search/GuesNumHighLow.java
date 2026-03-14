class GuessGame{

    private int pick=1;
    public int guess(int mid){
        if(mid>pick){
            return -1;
        } else if (mid<pick) {
            return 1;
        }
        else
            return 0;
    }
}
 class Child extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int ans=guess(mid);
            if(ans==-1){
                end=mid-1;
            } else if (ans==1) {
                start=mid+1;
            }
            else
                return mid;
        }
        return 0;
    }
}


public class GuesNumHighLow {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.guessNumber(2));

    }
}
