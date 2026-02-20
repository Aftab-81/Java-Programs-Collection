public class factorialOfANumber {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(7));
    }    
    static int factorialOfNumber(int n){
        if (n == 0) return 1;
        return n * factorialOfNumber(n - 1);
    }
}
