package Medium;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        SearchInRotatedSortedArray_33 obj = new SearchInRotatedSortedArray_33();
        System.out.println(obj.search(nums,target));
    }
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        return binarySearch(nums, pivot, target);
    }

    static int binarySearch(int[] nums,int pivot,int target){
            int start;
            int end;

            //case 0: if pivot is -1 then the array is not rotated then normal binary search or if array is small
            if(pivot==-1){
                start=0;
                end= nums.length-1;
                while(start<=end){
                    int mid = start+(end-start)/2;

                    if(nums[mid]==target) return mid;
                    else if(nums[mid]<target) start=mid+1;
                    else end=mid-1;
                }
                return -1;
            }

            //case 1: pivot == target
            if(nums[pivot]==target){
                return pivot;
            }

            //case 2: start<target then end = pivot-1
            else if (nums[0]<=target) {
                start=0;
                end=pivot-1;
            }
            //case 3: start>target the start=pivot+1
            else{
                start=pivot+1;
                end= nums.length-1;
            }
            while (start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]==target)
                    return mid;
                else if (nums[mid]<target) {
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            return -1;
        }

       static int findPivot(int[] nums){

            int start=0;
            int end= nums.length-1;
            while (start<=end){
                int mid = start+(end-start)/2;
                //case:1 mid>mid+1
                if(mid<end && nums[mid]>nums[mid+1]){
                    return mid;
                }
                //case:2 mid<mid-1
                else if (start<mid && nums[mid]<nums[mid-1]) {
                    return mid-1;
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
