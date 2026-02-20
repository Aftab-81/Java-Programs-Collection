public class demo{
    public static void main(String[] args){
        System.out.println(sumOfDigits(5));
    }
    static int  sumOfDigits(int n){
        return sumOfDigits(1, 0, n);
    }
    static int sumOfDigits(int current, int sum, int n){
        if (current > n) return 0;
        return sumOfDigits(current+1, n+sumOfDigits(n % 10), n);
    }
}