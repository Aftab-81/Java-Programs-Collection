public class abcd {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int arm = 0;
        while(num > 0){
            int digit = num % 10;   // 3 5 1
            arm = arm + (int) (Math.pow(digit, 3));
            num /= 10;  // 15   1   0
        }

        if (temp == arm) System.out.println("ArmStrong Number..");
        else System.out.println("Not ArmStrong Number..");
    }
}
