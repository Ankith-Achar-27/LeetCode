package Easy;


public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static  void main(String args[]){
        int[] digits = {1,2,3};
        PlusOne_66 ob = new PlusOne_66();
        int [] nums = ob.plusOne(digits);
        System.out.print("New Array: ");
            for (int num:nums){
                System.out.print(num+" ");
            }
        }
}

