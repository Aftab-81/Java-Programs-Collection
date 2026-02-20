import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] addr = reverseAnArray(arr);
        System.err.println(Arrays.toString(addr));
        System.err.println(addr);
    }
    static int[] reverseAnArray(int[] arr){
        int[] arr1 =new int[arr.length];
        return reverseAnArray(arr, arr.length - 1, arr1, 0);
    }
    static int[] reverseAnArray(int[] arr, int index, int[] arr2, int index2){
        if(index == -1) return arr2;
        arr2[index2] = arr[index];
        return reverseAnArray(arr, index - 1, arr2, index2 + 1 );
    }
}
