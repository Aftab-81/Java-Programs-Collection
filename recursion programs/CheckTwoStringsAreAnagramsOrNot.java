import java.util.Arrays;

public class CheckTwoStringsAreAnagramsOrNot {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "paple";
        System.out.println(checkStringAreAnagrams(s1, s2, s1.length(), s2.length()));
    }

    private static Boolean checkStringAreAnagrams(String str1, String str2, int n1, int n2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int sum1 = countSumOfCharByASCII(str1, n1);
        int sum2 = countSumOfCharByASCII(str2, n2);

        if(sum1 == sum2) 
            return true;
        else
            return false;
    }

    private static int countSumOfCharByASCII(String str1, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++){
            char c = str1.charAt(i);
            sum = sum + (int) c;
        }
        return sum;
    }
    
}
