public class CountZero{
    public static void main(String[] args) {
        int val = 10200030;
        System.out.println(countZerosInANumber(val));
    }
    static int countZerosInANumber(int n){
        return countZerosInANumber(n, 0);
    }
    static int countZerosInANumber(int n, int count){
        if (n == 0 ) return count;
        if(n % 10 == 0) 
            return countZerosInANumber(n / 10, ++count);
        else
            return countZerosInANumber(n / 10, count);
    }
}
