package Easy;

import java.util.Arrays;

class TestCase_888{
    int[] a;
    int[] b;

    TestCase_888(int[] aliceSizes,int[] bobSizes){
        this.a=aliceSizes;
        this.b=bobSizes;
    }
}

public class FairCandySwap_888 {
    public static void main(String[] args) {
        TestCase_888 test1  = new TestCase_888(new int[]{1,1},new int[]{2,2});
        TestCase_888 test2  = new TestCase_888(new int[]{1,2},new int[]{2,3});
        TestCase_888 test3  = new TestCase_888(new int[]{2},new int[]{1,3});

        System.out.println("TestCase1 solution: "+ Arrays.toString(fairCandySwap(test1.a,test1.b)));
        System.out.println("TestCase2 solution: "+ Arrays.toString(fairCandySwap(test2.a,test2.b)));
        System.out.println("TestCase3 solution: "+ Arrays.toString(fairCandySwap(test3.a,test3.b)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int bob_total=0;
        int alice_total=0;

        Arrays.sort(bobSizes);

        for(int n : aliceSizes){
            alice_total+=n;
        }
        for (int m : bobSizes) {
            bob_total+=m;
        }
        // FORMULA
        // x_total - x + y = y_total + x - y

        // (OR) y = 0.5*((bob_total-alice_total) + 2*aliceSizes[x]);

        // y = ((y_total - x_total)/2) + x
        // difference =  (y_total - x_total)/2
        // y = difference + x
        int diff = (bob_total-alice_total)/2;

        for(int x : aliceSizes){
            int y = x + diff;
            if(binarySearch(bobSizes,y)){
                return new int[]{x,y};
            }
        }
        return new int[]{-1,-1};
    }
    static boolean binarySearch(int[] b,int y){
        int start=0;
        int end=b.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(b[mid] == y){
                return true;
            }
            if(b[mid]<y){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
