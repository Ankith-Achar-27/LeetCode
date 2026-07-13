package Easy;

public class HighestAltitude_1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));

    }
    public static int largestAltitude(int[] gain){
        int alt=0;
        int max=0;

        for(int g : gain){
            alt+=g;
            max = Math.max(max,alt);
        }
        return max;
    }
}
