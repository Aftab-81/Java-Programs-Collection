public class recursion {
    public static void main(String[] args) {
        print(1);
    }

    
static void print(int n){
    if(n>10) return;
    print(n+1);
    System.out.println(n + " ");
}

}
