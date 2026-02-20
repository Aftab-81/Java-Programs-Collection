public class reverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseADigits(1234));
    }
    static int reverseADigits(int n){
        return reverseADigits(n, 0);
    }
    static int reverseADigits(int n, int rev){
        if (n == 0) return rev;
        return reverseADigits(n / 10, rev * 10 + (n % 10));
    }
}
