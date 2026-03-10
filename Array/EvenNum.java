
public class EvenNum {
    public static void main(String[] args) {
        EvenNum evn = new EvenNum();
        int [] nums = {437,315,322,431,686,264,442};
        int ans = evn.findNumbers(nums);
        System.out.print(ans);
    }
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

