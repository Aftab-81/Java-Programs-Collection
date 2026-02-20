
public class sumOfDigitsInANumber {
    public static void main(String[] args) {
        System.out.println(SumOfDigitsInANumber(1234));         // 1 + 2 + 3 + 4 = 10
        
    }
     static int SumOfDigitsInANumber(int n){
        if(n == 0) return 0;
        
        return (n % 10) + SumOfDigitsInANumber(n / 10);
           
     }
}
