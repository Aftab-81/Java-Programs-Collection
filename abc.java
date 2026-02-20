import java.util.ArrayList;
import java.util.Arrays;
public class abc {
    public static void main(String[] args) {
       int a = 789;
       int sum = 0;
       while(a > 0){
        int digits = a % 10;    // 9 8 7
        sum += digits;
        a /= 10;                // 78 7 0
       }

       System.out.println("Total Sum is: "+ sum);

    }
}
