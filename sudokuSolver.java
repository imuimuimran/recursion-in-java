public class sudokuSolver {
    public boolean solveSudoku(int[][] grid, int num) {
        int r = -1, c = -1;
        boolean isVacant = true;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(grid[i][j] == 0) {
                    r = i;
                    c = j;
                    isVacant = false;
                    break;
                }
            }
            if(!isVacant) {
                break;
            }
        }
        // if there is no empty space left in the grid  
        if(isVacant) {
            return true;
        }
        // otherwise for each row do the backtracking 
        for(int no = 1; no <= num; no++) {
            if(isSafe(grid, r, c, no)) {
                grid[r][c] = no;
                if(solveSudoku(grid, num)) {
                 // display (board, num)
                    return true;
                }else {
                grid[r][c] = 0;
                }
            }
        }
        return false;
    }

    public void display(int[][] grid, int n) {
        // just display the function
        for(int i = 0; i < n; i++) {
            for(int dis = 0; dis < n; dis++) {
                System.out.print(grid[i][dis]);
                System.out.print(" ");
            }
            System.out.println();
            if((i + 1) % (int)Math.sqrt(n) == 0) {
                System.out.print("");
            }
        }
    } 

    public static void main(String[] args) {
        // Input Grid 9 x 9
        int[][] grid = new int[][] {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 0},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 0},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        // Creating an object
        sudokuSolver obj = new sudokuSolver();

        // Calculate the size of the grid
        int size = grid.length;
        System.out.println("The grid is: ");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        if(obj.solveSudoku(grid, size)) {
            // Print the solution
            System.out.println("The Solution of given Sudoku is: ");
            obj.display(grid, size);
        }else {
            System.out.println("The solution is not possible!");
        }
    }
}