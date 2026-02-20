import java.util.ArrayList;

public class inte {
    public static void main(String[] args) {
       int a = 12345;   // 52341
       int first = a/10000;
       int last = a % 10;
       int mid = (a/10)%1000;
       System.out.println("Before: "+a);
       System.out.println("After: "+last+""+mid+""+first);  

    }
    
}
