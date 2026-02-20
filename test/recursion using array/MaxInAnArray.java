
public class MaxInAnArray {
    public static void main(String[] args) {
        int []arr = {10, 37, 20, 86, 30,40, 99};
        System.out.println(maxNumberInArray(arr));
    }    
    static int maxNumberInArray(int []arr){
        return maxNumberInArray(arr, 0, 0);
    }
    static int maxNumberInArray(int []arr, int index, int max){
        if(index == arr.length) return 0;
        if(arr[index] > maxNumberInArray(arr, index + 1, arr[index])) return arr[index];
        else 
            return maxNumberInArray(arr, index + 1, max);
    }
}
