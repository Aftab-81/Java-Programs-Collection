
public class CountEvenNumbersInArray {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6};
        System.out.println(countEvenNumbers(arr));
    }
    static int countEvenNumbers(int arr[]){
        return countEvenNumbers(arr, 0, 0);
    }
    static int countEvenNumbers(int[] arr, int position, int count){
        if(position == arr.length) return count;
        if(arr[position] % 2 == 0) 
            return countEvenNumbers(arr, position + 1, count + 1);
        else
            return countEvenNumbers(arr, position + 1, count);
    }
}
