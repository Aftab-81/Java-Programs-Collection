
public class FindTotalPathWithObstacleInBetween {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println(countTotalPathsWithObstacle(grid, 0, 0));
    }    
    static int countTotalPathsWithObstacle(int[][] grid, int i, int j){
        if(i == grid.length - 1 && j == grid[0].length - 1) return 1;
        if(i > grid.length - 1 || j > grid[0].length - 1) return 0;
        if(grid[i][j] == 1) return 0;

        return countTotalPathsWithObstacle(grid, i, j + 1) + countTotalPathsWithObstacle(grid, i + 1, j);
    }
}
