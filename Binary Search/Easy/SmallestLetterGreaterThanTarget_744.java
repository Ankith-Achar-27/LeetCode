package Easy;

public class SmallestLetterGreaterThanTarget_744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        SmallestLetterGreaterThanTarget_744 obj = new SmallestLetterGreaterThanTarget_744();
        char target = 'j';
        char ans = obj.nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // Here we should skip the equal target hence >= used
            if(target>=letters[mid]){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return letters[start % letters.length]; // the main logic when s=end+1 or length then % length return 0
    }
}
