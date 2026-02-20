public class FindFirstElementInArray {
    public static void main(String[] args) {
        int arr[] = {50,10, 20, 30, 40, 50};
        System.err.println(findFirstElement(arr));
    }
    static int findFirstElement(int[] arr){
        return findFirstElement(arr, 0);
    }
    static int findFirstElement(int []arr, int index){
        if(index == 0) return arr[index];
        return findFirstElement(arr, index - 1);
    }
}
