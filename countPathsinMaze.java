public class countPathsinMaze {
    public static int countPaths(int n, int m, int i, int j) {
        // Go to current cell to desire cell with only right and down moved

        if(i == n || j == m) {
            return 0;
        }

        if(i == n -1 && j == m -1) {
            return 1;
        }
        // Move Downwards
        int downPaths = countPaths(n, m, i + 1, j);

        // Move Right
        int rightPaths = countPaths(n, m, i, j + 1);
        
        int totalPaths = downPaths + rightPaths;

        return totalPaths;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;

        int result = countPaths(n, m, 0, 0);

        System.out.println(result);
    }
}