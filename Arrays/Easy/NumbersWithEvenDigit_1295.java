package Easy;

public class NumbersWithEvenDigit_1295 {
    public int findNumbers(int[] nums) {

        int n=0;
        for(int num : nums){
            int count = 0;
            while(num>0){
                num= num/10;
                count++;
            }
            if (count%2==0){
                n++;
            }
        }
        return n;
    }
}
