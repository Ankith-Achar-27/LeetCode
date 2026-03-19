import java.util.Arrays;

public class Medium_FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        Medium_FindDuplicate obj = new Medium_FindDuplicate();
        System.out.println(obj.findDuplicate(nums));
    }
    //Time complexity: O(n log(n))
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
        }
    }
