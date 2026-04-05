public class CompareVersionNumber_165 {
    public static void main(String[] args) {
        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compareVersion(version1,version2));

    }
    static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int n = Integer.max(ver1.length,ver2.length);
        int num1,num2;

        for (int i=0;i<n;i++){
            num1 = (i<ver1.length) ? Integer.parseInt(ver1[i]) : 0;
            num2 = (i<ver2.length) ? Integer.parseInt(ver2[i]) : 0;

            if (num1>num2){
                return 1;
            }
            if (num1<num2){
                return -1;
            }
        }
        return 0;
    }
}
