package Easy;

class BinarySearch_704 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

        int tar = 2;

        int ans = Search(arr,tar);
        System.out.print(ans);


    }
    static int Search(int[] arr,int tar){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(tar<arr[mid]){
                end=mid-1;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}