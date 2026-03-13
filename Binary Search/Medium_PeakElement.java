public class Medium_PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        Medium_PeakElement obj = new Medium_PeakElement();
        System.out.println(obj.findPeakElement(nums));

    }

    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int n = nums.length;
        if(nums[0]>nums[1]){
            return 0;
        }
        else if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        else{
            int start=1;
            int end = n-2;
            while (start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if (nums[mid]<nums[mid-1]) {
                    end=mid-1;
                }
                else if (nums[mid]<nums[mid+1]) {
                    start = mid+1;
                }

            }
        }
        return -1;
    }
}
