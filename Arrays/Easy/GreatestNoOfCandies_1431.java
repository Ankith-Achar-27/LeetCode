package Easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestNoOfCandies_1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3},3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
        System.out.println(kidsWithCandies(new int[]{12,1,12},10));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max=Integer.MIN_VALUE;

        for (int n : candies){
            max = Math.max(max,n);
        }

       for (int c : candies){
           list.add(c+extraCandies>=max);
       }
       return list;
    }
}
