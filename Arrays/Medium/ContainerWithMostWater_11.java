package Medium;

public class ContainerWithMostWater_11 {
    static void main() {
        int[] height={1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater_11 obj = new ContainerWithMostWater_11();
        System.out.println(obj.maxArea(height));
    }
    public int maxArea(int[] height) {
        int max=0;
        int length;
        int start=0;
        int end= height.length-1;
        while (start<end){
            length=Integer.min(height[start],height[end]);
            max=Integer.max(max,(end-start)*length);
            if(height[start]<=height[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return max;

    }
}
