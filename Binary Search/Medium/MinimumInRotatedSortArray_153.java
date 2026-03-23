package Medium;

public class MinimumInRotatedSortArray_153 {
    public static void main(String[] args) {
        int[] nums={11,13,15,17};
        MinimumInRotatedSortArray_153 obj = new MinimumInRotatedSortArray_153();
        System.out.println(obj.findMin(nums));
    }
    public int findMin(int[] nums) {
        int least = findleast(nums);
        if(least==-1){
            return nums[0];
        }
        return nums[least];
    }

    static int findleast(int[] nums){

        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            //case:1 mid>mid+1
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid+1;
            }
            //case:2 mid<mid-1
            else if (start<mid && nums[mid]<nums[mid-1]) {
                return mid;
            }
            //case 3: start>=mid
            else if (nums[start]>=nums[mid]) {
                end=mid-1;
            }
            //case 4: start<=mid
            else
                start=mid+1;

        }
        return -1;
    }
}
