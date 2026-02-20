public class new1 {
    public static void main(String[] args) {
        printEvenNumbers(10);
    }
    static void printEvenNumbers(int n){
        if(n == 0) return;
        if(n % 2 == 1) System.out.println(n + " ");
        printEvenNumbers(n - 1);
    }
}
