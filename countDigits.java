public class countDigits {
    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(123675));
    }

    static int countNumberOfDigits(long n) {
        return countHelper(n, 0);
    }

    static int countHelper(long n, int count) {
        // BASE CONDITION (STOP)
        if (n == 0) {
            return count;
        }

        // WORK + RECURSION
        return countHelper(n / 10, count + 1);
    }
}
