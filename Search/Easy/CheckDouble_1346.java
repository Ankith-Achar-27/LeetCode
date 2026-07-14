package Easy;

import java.util.HashSet;

public class CheckDouble_1346 {
    public static void main(String[] args) {
        System.out.println(checkExist(new int[]{10, 2, 5, 3}));
        System.out.println(checkExist(new int[]{3,1,7,11}));
    }

    public static boolean checkExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num * 2)) {
                return true;
            }

            if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
