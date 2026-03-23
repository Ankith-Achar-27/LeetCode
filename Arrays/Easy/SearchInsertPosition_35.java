package Easy;

public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            //To Avoid Overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left;    }
    public static void main(String[] args){
        int[] num = {1,3,5,6};
        int target = 7;//target = 2 or 5
        SearchInsertPosition_35 ob = new SearchInsertPosition_35();
        int k = ob.searchInsert(num,target);
        System.out.print("Index position: "+k);
    }
}
