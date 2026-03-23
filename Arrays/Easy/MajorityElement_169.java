package Easy;

public class MajorityElement_169 {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int num:nums){
            result = result^num;
        }
        return result;
    }
}
