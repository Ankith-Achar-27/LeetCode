public class Cieling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18,19};
        int target = 4;
        int ans = ciel(nums,target);
        System.out.println(nums[ans]);
    }
    static int ciel(int[] nums,int tar){
        int start=0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(tar<nums[mid]){
                end=mid-1;
            }
            else if(tar>nums[mid]){
                start=mid+1;
            }
            else if(tar==nums[mid])
                return mid;
        }
        return start; 
        // return end;   (if want to return floor of the target if not found)
    }
}

