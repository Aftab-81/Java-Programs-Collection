public class MaxNumInDigit {
    public static void main(String[] args) {
        System.out.println(maxNumberInDigit(93821));
    }
    static int maxNumberInDigit(int n){
        return maxNumberInDigit(n, 1);
    }
    static int maxNumberInDigit(int n, int max){
        if(n == 0) return max;
        
        if(max < (n % 10) ) 
            return maxNumberInDigit(n / 10, n % 10);
        else
            return maxNumberInDigit(n / 10, max);
    }
}
