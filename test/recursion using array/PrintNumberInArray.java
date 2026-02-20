
public class PrintNumberInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        printNumbers(arr);
    }
    static void printNumbers(int[] arr){
        printNumbers(arr, arr.length - 1);
    }
    static void printNumbers(int []arr, int index){
        if (index == -1) return;
        System.out.println(arr[index] + " ");
        printNumbers(arr, index - 1);
    }
}
