package Easy;

public class RecursionBinarySearch_704 {
    public static void main(String[] args) {
        int ans = search(new int[]{-1,0,3,5,9,12},9);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        return helper(nums,target,0, nums.length-1);
    }
    static int helper(int[] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[m]<target){
            return helper(nums, target, m+1, e);
        }
        else {
            return helper(nums, target, s, m-1);
        }

    }
}
