public class brainStorm {
    public static void main(String[] args) {
        int num = 1327;     // Check Ascending or not
        int prevData = 10;
        Boolean isAscending = true;
        while(num != 0){
            int current = num % 10;
            if(current > prevData){
                isAscending = false;
                break;
            }
            prevData = current;
            num /= 10;
        }

        System.out.println(isAscending);

    }
}
