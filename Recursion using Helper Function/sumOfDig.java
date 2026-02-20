

public class sumOfDig {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123455));
    }   
    static int sumOfDigits(int n){
        return sumOfDigits(n, 0);
    }
    static int sumOfDigits(int n, int end){
        if(n == end) return 0;
        return (n%10) + sumOfDigits(n/10, 0);
    }
}
