/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = peakIndexInMountainArray(mountainArr);
        int peak = mountainArr.get(n);

        if(peak==target)
            return n;

        int asc = Search(mountainArr,target,0,n-1,true);
        if(asc!= -1){
            return asc;
        }

        int desc = Search(mountainArr,target,n+1,mountainArr.length()-1,false);
        return desc;
    }
    static int peakIndexInMountainArray(MountainArray arr) {
        int start=0;
        int end=arr.length()-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                end=mid;
            } else{
                start=mid+1;
            }
        }
        return start;
    }
    static int Search(MountainArray arr,int target,int st,int en,boolean ascending){
        int start=st;
        int end = en;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target==arr.get(mid)){
                return mid;}

            if(ascending){
                if(target<arr.get(mid)){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            else{
                if(target<arr.get(mid)){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}