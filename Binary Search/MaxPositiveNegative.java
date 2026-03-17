public class MaxPositiveNegative {
    public static void main(String[] args) {
        int[] nums={-2,-1,-1,1,2,3};
        MaxPositiveNegative obj = new MaxPositiveNegative();
        System.out.println(obj.maximumCount(nums));

    }
    // Time Complexity: O(n)
    // Need to Reduce further
    public int maximumCount(int[] nums) {
        int neg=0;
        int pos=0;
        for(int i:nums){
            if(i>0){
                pos++;
            }
            else
                neg++;
        }
        return Integer.max(pos,neg);
    }
}
