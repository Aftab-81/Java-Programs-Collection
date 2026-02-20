import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int []arr = {1,2,5,3,4};
        if(checkArrayIsSortedOrNot(arr))
            System.err.println(true);
        else
            System.err.println(false); 
    }

    static boolean checkArrayIsSortedOrNot(int[] arr){
        return checkArrayIsSortedOrNot(arr, 0);
    }
    static boolean checkArrayIsSortedOrNot(int[] arr, int index){
        if(index == arr.length - 1) return true;
        if(arr[index] > arr[index + 1])
            return false;
        return checkArrayIsSortedOrNot(arr, index + 1);
    }
    
}
