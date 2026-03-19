import java.util.Arrays;


public class Medium_TwoSum {
    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int target =9;
        Medium_TwoSum obj = new Medium_TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(num,target)));
    }
    public int[] twoSum(int[] numbers,int target){
        int start=0;
        int end = numbers.length-1;

        while (start<end){
            int sum = numbers[start]+numbers[end];
            int mid = start+(end-start)/2;
            if (sum==target){
                return new int[]{start+1,end+1};}
            if(sum<target){
                start++;
            }
            else
                end--;
        }
        return new int[]{-1,-1};
    }
}
