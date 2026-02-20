
public class demo {
    public static void main(String[] args) {
        printNNumbers(5);
    }    
        /*Printing in Ascending Order */
    // static void printNNumbers(int n){
    //     printNNumbers(n , 1);
    // }
    // static void printNNumbers(int n, int start){
    //     if ( start > n) return;
    //     System.out.println(start + " ");
    //     printNNumbers(n, start + 1);
    // }

        /*Printing in Descending Order */

    static void printNNumbers(int n){
        printNNumbers(n, 5);
    }
    static void printNNumbers(int n, int start){
        if (start == 0) return;
        System.out.println(start + " ");
        printNNumbers(n, start - 1);
    }
    
}
