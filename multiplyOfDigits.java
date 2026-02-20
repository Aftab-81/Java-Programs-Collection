public class multiplyOfDigits {
    public static void main(String[] args) {
        System.out.println(multiplyOfDigits(12345));
    }
    static int multiplyOfDigits(int n){
        return multiplyOfDigits(n, 1);
    }
    static int multiplyOfDigits(int n, int multiple){
        if(n == 0) return multiple;

        return multiplyOfDigits(n / 10, multiple * (n % 10));
    }
}
