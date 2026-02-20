public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int k = 50;
        if(checkForElementInArray(arr, k))
            System.out.println("Search Successful");
        else
            System.err.println("Search Unsuccessful..");
    }    
    static boolean checkForElementInArray(int []arr, int k){

        int x = checkForElementInArray(arr, k, 0);
        if(x == 1)
            return true;
        else 
            return false;
    }

    static int checkForElementInArray(int[] arr, int k, int index){
        if(index == arr.length) return 0;

        if(arr[index] == k) 
            return 1;
        else if(arr[index] != k)
            return checkForElementInArray(arr, k, index + 1);
        else
            return 0;
    }
}
