public class helperFun {
    public static void main(String[] args) {
        helpFunctions(5);
    }
    static void helpFunctions(int n){
        helpFunctions(1, n);
        
    }
    static void helpFunctions(int count, int n){
        if(count > n) return;
        System.out.println(count);
        helpFunctions(count+1, n);
    }
}
