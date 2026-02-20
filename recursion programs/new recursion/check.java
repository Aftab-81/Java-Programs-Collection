
public class check {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789l));
    }
    static int countDigits(long n){   
        if(n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
    
}
