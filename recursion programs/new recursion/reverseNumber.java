

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseANumber(1234));       // 1234 => 4321
    }
    static String reverseANumber(int n){
        if (n == 0) return "";

        return (n % 10) + ""+ reverseANumber(n / 10);
    }
}
