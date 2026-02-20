public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(checkPowerOfDigit(3, 3));
    }
    static int checkPowerOfDigit(int n, int pow){
        if (pow == 0) return 1;
        return n * checkPowerOfDigit(n, pow - 1);
    }
}
