package Easy;

class  MissingNumberTestCase{
    int[] nums;
    MissingNumberTestCase(int[] nums){
        this.nums = nums;
    }

}

public class MissingNumber_268 {
    public static void main(String[] args) {
        MissingNumberTestCase test1 = new MissingNumberTestCase(new int[] {3,0,1});
        MissingNumberTestCase test2 = new MissingNumberTestCase(new int[] {0,1});
        MissingNumberTestCase test3 = new MissingNumberTestCase(new int[] {9,6,4,2,3,5,7,0,1});

        System.out.println("Test Case1 result: " + missingNumber(test1.nums));

        System.out.println("Test Case2 result: " + missingNumber(test2.nums));

        System.out.println("Test Case3 result: " + missingNumber(test3.nums));
    }

//    Using Binary Search
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int start=0;
//        int end = nums.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (nums[mid]==mid) start=mid+1;
//            else end =mid-1;
//        }
//    return start;
//    }

//    Using Cyclic Sort
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    }


