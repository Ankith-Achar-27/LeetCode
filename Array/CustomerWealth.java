import javax.swing.plaf.basic.BasicCheckBoxUI;
import java.util.zip.CheckedOutputStream;

public class CustomerWealth {
    public static void main(String[] args) {
        CustomerWealth cust = new CustomerWealth();
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans = cust.maximumWealth(accounts);
        System.out.println(ans);
    }
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] row:accounts){
            int sum = 0;
            for (int col:row){
                sum+=col;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
