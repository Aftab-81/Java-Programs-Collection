

public class SumOfArrayElements {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        System.out.println(sumOfArrayElements(arr));
    }
    static int sumOfArrayElements(int []arr){
        return sumOfArrayElements(arr, 0);
    }
    static int sumOfArrayElements(int[] arr, int index){
        if(index == arr.length) return 0;
        return arr[index] + sumOfArrayElements(arr, index + 1);
    }
}
