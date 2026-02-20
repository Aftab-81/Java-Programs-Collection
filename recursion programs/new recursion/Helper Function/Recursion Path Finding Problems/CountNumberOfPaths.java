public class CountNumberOfPaths {
    public static void main(String[] args){
        // You can only move in Horizontal and Vertical Way
        int[][] mat = new int[4][4];
        int n = mat.length - 1;
        int m = mat[0].length - 1;

        System.out.println(countNumberOfPaths(0, 0, n, m));

    }
               // (0, 0)    ==> (0, 0, 1, 1)

    static int countNumberOfPaths(int i, int j, int end_row, int end_columns){
        if(i == end_row && j == end_columns) return 1;
        if(i > end_row || j > end_columns) return 0;

        return countNumberOfPaths(i, j + 1, end_row, end_columns) + countNumberOfPaths(i + 1, j, end_row, end_columns);
    }
}
