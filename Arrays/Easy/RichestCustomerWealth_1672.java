package Easy;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        RichestCustomerWealth_1672 cust = new RichestCustomerWealth_1672();
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
