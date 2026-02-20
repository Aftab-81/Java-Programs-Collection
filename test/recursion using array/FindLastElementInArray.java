public class FindLastElementInArray {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        System.err.println(findLastElement(arr));
    }
    static int findLastElement(int[] arr){
        return findLastElement(arr, 0);
    }
    static int findLastElement(int[] arr, int index){
        if(index == arr.length - 1) return arr[index];
        return findLastElement(arr, index + 1);
    }
}
