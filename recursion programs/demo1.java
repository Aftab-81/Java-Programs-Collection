public class demo1 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10));
    }
    static int sumOfDigits(int n){
        if(n == 0 ) return 0;
        return n + sumOfDigits(n - 1);
    }
}
