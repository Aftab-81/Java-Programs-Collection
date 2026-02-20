
public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 0, 0},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
        };
        findRatInMaze(maze, 0, 0);
    }

    static Boolean findRatInMaze(int[][] maze, int i, int j){
        if(isSafe(maze, i, j, maze.length)){
            if(findRatInMaze(maze, i + 1, j) || findRatInMaze(maze, i, j + 1)) return true;
        }
        return false;
    }
    
    static boolean isSafe(int[][] maze, int i, int j, int n){
        return (
            i <= 0 && i < n
            &&
            j <= 0 && j < n
            &&
            maze[i][j] == 1
        );
    }

}