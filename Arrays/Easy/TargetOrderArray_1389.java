package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetOrderArray_1389 {
    public static void main(String[] args) {
        int[] n1={0,1,2,3,4};
        int[] i1={0,1,2,2,1};
        int[] n2 = {1,2,3,4,0};
        int[] i2={0,1,2,3,0};
        int[] n3={1};
        int[] i3={0};

        System.out.println(Arrays.toString(createTargetArray(n1,i1)));
        System.out.println(Arrays.toString(createTargetArray(n2,i2)));
        System.out.println(Arrays.toString(createTargetArray(n3,i3)));
    }
    public static int[] createTargetArray(int[] nums,int[] index){

        List<Integer> ans = new ArrayList<>();

        for (int i=0;i< nums.length;i++){
            ans.add(index[i],nums[i]);
        }

        for (int i=0;i< nums.length;i++){
            nums[i]= ans.get(i);
        }
        return nums;
    }
}
