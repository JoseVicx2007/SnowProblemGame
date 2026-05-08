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
    public static final int MAX_LEVEL = Levels.MAX_LEVEL; // its better to class for just levels 

    int[][] grid;
    int currentLevel;

    public Board() {
        grid = new int[ROWS][COLS];
        loadLevel(1);
    }

    void clearBoard() {
        grid = new int[ROWS][COLS];
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getSnowmenNeeded() {
        int snowmenNeeded = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == SNOWMAN_HEAD || grid[row][col] == FULL_SNOWMAN) {    // For if one more than snowman is needed the game does not end
                    snowmenNeeded++;
                }
            }
        }

        return snowmenNeeded;
    }

    public void loadLevel(int level) {
        if (level < 1 || level > MAX_LEVEL) {
            return;
        }

        Levels.loadLevel(this, level);
    }

    public boolean isInsideBoard(int row, int col) {                
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    public boolean allowedToWalk(int row, int col) {
        if (!isInsideBoard(row, col)) {
            return false;
        }

        // only tree blocks movement, everything else is fine
        if (grid[row][col] == TREE) 
            return false;

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

        newBoard.currentLevel = this.currentLevel;

        return newBoard;
    }
}
