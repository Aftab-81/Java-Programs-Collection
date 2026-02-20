public class sumofNDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1));
    }
    static int sumOfDigits(int n){
        if(n > 10) return 0;
        return n + sumOfDigits(n + 1);
    }
}
