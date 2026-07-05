package Easy;

public class MajorityElement_169 {
    public static void main(String[] args) {
        System.out.println("Case1 Solution: "+singleNumber(new int[]{3,2,3}));
        System.out.println("Case2 Solution: "+singleNumber(new int[]{2,2,1,1,1,2,2}));

    }
    public static int singleNumber(int[] nums) {
/*        int result=0;
        for (int num:nums){
            result = result^num;
        }
        return result;*/

        // Moore Voting Algorithm

        int candidate=0;
        int count=0;
        for (int n:nums){
            if (count==0){
                candidate=n;
                count++;
            }
            else if ( n==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}
