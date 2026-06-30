package Medium;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class TestCase_442{
    int[] nums;
    TestCase_442(int[] nums){
        this.nums=nums;
    }
}
public class FindAllDuplicate_442 {
    public static void main(String[] args) {
        TestCase_442 test1 = new TestCase_442(new int[] {4,3,2,7,8,2,3,1});
        TestCase_442 test2 = new TestCase_442(new int[] {1,1,2});
        TestCase_442 test3 = new TestCase_442(new int[] {1});

        System.out.println("Case1 Solution: "+ findDuplicates(test1.nums));
        System.out.println("Case2 Solution: "+ findDuplicates(test2.nums));
        System.out.println("Case3 Solution: "+ findDuplicates(test3.nums));


    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int index=0;index< nums.length;index++){
            if(nums[index]!=index+1){
                answer.add(nums[index]);
            }
        }
        return answer;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
