package Medium;

public class JumpGame_55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));

    }
    public static boolean canJump(int[] nums) {
        int reach=0;

        for (int i=0;i< nums.length;i++){
            if (i>reach){
                return false;
            }
            reach = Math.max(reach,nums[i]+i);
        }
        return true;
    }
}
