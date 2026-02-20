public class CountOccurenceOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 2, 3, 5};
        int k = 5;
        System.err.println(countOccurenceOfNumber(arr, k));
    }
    static int countOccurenceOfNumber(int arr[], int k){
        return countOccurenceOfNumber(arr, k, 0, 0);
    }
    static int countOccurenceOfNumber(int[] arr, int k, int index, int count){
        if(index == arr.length) return count;
        if(arr[index] == k)
            return countOccurenceOfNumber(arr, k, index + 1, count + 1);
        else
            return countOccurenceOfNumber(arr, k, index + 1, count);
    }
}
