public class addOfEven {
    public static void main(String[] args) {
        System.out.println(additionofEvenOddNumbers(10));
    }
    static int additionofEvenOddNumbers(int n){
        if (n == 0) return 0;
        if (n % 2 == 0) 
            return n + additionofEvenOddNumbers(n - 1);
        else 
            return additionofEvenOddNumbers(n - 1);
    }
}
