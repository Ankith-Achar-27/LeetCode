package Medium;

import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {-1,-100,3,99};

        rotate(arr1,3);
        System.out.println(Arrays.toString(arr1));

        rotate(arr2,2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
