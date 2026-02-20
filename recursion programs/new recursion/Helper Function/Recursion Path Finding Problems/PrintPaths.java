public class PrintPaths {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];

        printAbsolutePath(0, 0, mat.length - 1, mat[0].length - 1, "");
    }    

    static void printAbsolutePath(int i, int j, int n, int m, String path){
        if(i == n && j == m){
            System.out.println(path); 
            return;
        } 
        if(i > n || j > m) return;
        
        printAbsolutePath(i, j + 1, n, m, path + "R");
        printAbsolutePath(i + 1, j, n, m, path + "D");
    }
}
