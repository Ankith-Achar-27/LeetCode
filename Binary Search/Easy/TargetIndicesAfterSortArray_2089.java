package Easy;

import java.util.ArrayList;
import java.util.List;

public class TargetIndicesAfterSortArray_2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int equal=0;
        for(int n:nums){
            if(n==target){
                equal++;
            }
            else if(n<target){
                less++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < equal; i++){
            res.add(less+i);
        }
        return res;
    }
}
