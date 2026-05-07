public class Board {

    public static final int EMPTY = 0;          //All classes will inherit this logic here
    public static final int SMALL_SNOWBALL = 1;
    public static final int BIG_SNOWBALL = 2;
    public static final int TREE = 3;
    public static final int SNOWMAN_HEAD = 4;
    public static final int SEMI_SNOWMAN = 5;
    public static final int FULL_SNOWMAN = 6;

    public static final int ROWS = 4;
    public static final int COLS = 5; // sets the grid 

    private int[][] grid;

    public Board() {
        grid = new int[ROWS][COLS];
        Level1();
    }

    public void Level1() { // first level
        grid = new int[ROWS][COLS];
        grid[3][0] = SMALL_SNOWBALL;
        grid[3][2] = BIG_SNOWBALL;
        grid[3][3] = TREE;
        grid[2][2] = SNOWMAN_HEAD;
    }

    public boolean isInsideBoard(int row, int col) {                
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    public boolean allowedToWalk(int row, int col) {
        if (!isInsideBoard(row, col)) {
            return false;
        }

        // only tree blocks movement, everything else is fine
        if (grid[row][col] == TREE) return false;

        return true;
    }

    public void Placer(int row, int col, int value) { //Places the pieces where you want them in board
        if (isInsideBoard(row, col)) {
            grid[row][col] = value;
        }
    }

    public void Replacer(int row, int col) { //substitute the pieces by setting the square to empty first
        if (isInsideBoard(row, col)) {
            grid[row][col] = EMPTY;
        }
    }

    // Another method name for clearing squares
    public void clearSquare(int row, int col) {
        Replacer(row, col);
    }

    public int getSquare(int row, int col) {
        if (!isInsideBoard(row, col)) return EMPTY; // used to crash here, fixed
        return grid[row][col];
    }

    public boolean isEmptySquare(int row, int col) {
        if (isInsideBoard(row, col)) {
            return grid[row][col] == EMPTY;
        }
        return false;
    }

    public int[][] getGrid() { // we get the board so we can implement it on the game
        return grid;
    }

    public Board copy() { // this logic will apply if we need to implement BFS
        Board newBoard = new Board();

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                newBoard.grid[row][col] = this.grid[row][col];
            }
        }

        return newBoard;
    }
}
