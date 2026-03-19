// Mountain Array where the peak element is somewhere in between two elements

public class Medium_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        Medium_MountainArray obj = new  Medium_MountainArray();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            // To check arr[mid] is in Ascending slope or Descending Slope
            // arr[mid]<arr[mid+1] then start = mid+1
            // arr[mid]>arr[mid+1] then end = mid
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else{
                start=mid+1;
            }
        }
    return start;
    }
}
