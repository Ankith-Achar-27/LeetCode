package Medium;// Mountain Array where the peak element is somewhere in between two elements

public class PeakIndexMountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else{
                start=mid+1;
            }
        }
        return start;
    }
}
