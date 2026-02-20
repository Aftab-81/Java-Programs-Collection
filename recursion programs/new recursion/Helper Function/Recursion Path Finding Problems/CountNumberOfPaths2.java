public class CountNumberOfPaths2 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println(countNumbersOfPath(0, 0, matrix.length - 1, matrix[0].length - 1));
    }
    static int countNumbersOfPath(int i, int j, int n, int m){
        if(i == n && j == m) return 1;
        if(i > n || j > m) return 0;

        return countNumbersOfPath(i, j + 1, n, m) + countNumbersOfPath(i + 1, j, n, m) + countNumbersOfPath(i + 1, j + 1, n, m);
    }
}