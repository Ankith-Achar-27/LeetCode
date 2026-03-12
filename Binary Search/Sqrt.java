public class Sqrt {
    public static void main(String[] args) {
        Sqrt ob = new Sqrt();
        int x = 2147395599;
        System.out.print(ob.mySqrt(x));

    }
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int s=2;
        int e=x/2;
        int m=0;
        while (s<=e){
            m = s+(e-s)/2;
            if(m==x/m){
                return m;
            }
            else if (m>x/m) {
                e=m-1;
            }
            else
                s=m+1;
        }
        return e;

    }
}

