public class CountElementsInArray {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70,80,90};
        System.err.println(countElemetsInArray(arr));
    }    
    static int countElemetsInArray(int[] arr){
        return countElemetsInArray(arr , 0, 0);
    }
    static int countElemetsInArray(int[] arr, int index, int count){
        if(index == arr.length) return count;
        return countElemetsInArray(arr, index + 1, count + 1);
    }
}
