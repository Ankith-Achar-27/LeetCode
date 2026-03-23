package Easy;
// XOR operator acts as pair cancellation that is it cancels all the duplicate and gives the unique one

public class Xor {
    public static void main(String[] args) {
        Xor ob = new Xor();
        int[] nums = {4,1,2,1,2};
        System.out.println(ob.singleNumber(nums));

    }
        public int singleNumber(int[] nums) {
        int result=0;
        for (int num:nums){
            result = result^num;
        }
        return result;

        }
}
