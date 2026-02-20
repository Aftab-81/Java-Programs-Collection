public class DecToBin {
    public static void main(String[] args) {
        int n = 10;
        int bin = decimalToBinary(n);
        System.out.println("Binary of "+ n + " is "+bin);
    }
    static int decimalToBinary(int n){
        return decimalToBinary(n, "");
    }
    static int decimalToBinary(int n, String rem){
        if(n == 0) return Integer.parseInt(rem);
        return decimalToBinary(n / 2, n % 2 + ""+rem);
    }
}


