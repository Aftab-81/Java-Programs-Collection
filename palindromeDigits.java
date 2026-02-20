public class palindromeDigits {
    public static void main(String[] args) {
        int val = 1221;
        int num = val;
        if(val == checkForPalindrome(num)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    static int checkForPalindrome(int n){
        return checkForPalindrome(n, 0);
    }

    static int checkForPalindrome(int n, int rev){
        if(n == 0) return rev;
        return checkForPalindrome(n / 10, rev * 10 + (n % 10));
    }
}
