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
    public static final int MAX_LEVEL = 16;
    
    private int[][] grid;
    private int currentLevel;

    public Board() {
        grid = new int[ROWS][COLS];
        Level1();
    }
    public int getCurrentLevel() {
        return currentLevel;
    }
        public void loadLevel(int level) {
        if (level < 1 || level > MAX_LEVEL) {
            return;
        }

        switch (level) {
            case 1: Level1(); break;
            case 2: Level2(); break;
            case 3: Level3(); break;
            case 4: Level4(); break;
            case 5: Level5(); break;
            case 6: Level6(); break;
            case 7: Level7(); break;
            case 8: Level8(); break;
            case 9: Level9(); break;
            case 10: Level10(); break;
            case 11: Level11(); break;
            case 12: Level12(); break;
            case 13: Level13(); break;
            case 14: Level14(); break;
            case 15: Level15(); break;
            case 16: Level16(); break;
        }
    }

    public void Level1() {
        currentLevel = 1;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[0][4] = SNOWMAN_HEAD;
        grid[0][3] = SMALL_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level2() {
        currentLevel = 2;
        clearBoard();
        grid[1][0] = SMALL_SNOWBALL;
        grid[1][3] = TREE;
        grid[2][1] = SNOWMAN_HEAD;
        grid[2][4] = BIG_SNOWBALL;
    }

    public void Level3() {
        currentLevel = 3;
        clearBoard();
        grid[0][3] = TREE;
        grid[1][0] = SNOWMAN_HEAD;
        grid[2][1] = SMALL_SNOWBALL;
        grid[3][1] = BIG_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level4() {
        currentLevel = 4;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[0][4] = SNOWMAN_HEAD;
        grid[3][0] = SMALL_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level5() {
        currentLevel = 5;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[0][4] = SMALL_SNOWBALL;
        grid[2][2] = SNOWMAN_HEAD;
        grid[3][0] = TREE;
        grid[3][2] = TREE;
        grid[3][4] = TREE;
    }

    public void Level6() {
        currentLevel = 6;
        clearBoard();
        grid[0][2] = TREE;
        grid[2][1] = BIG_SNOWBALL;
        grid[2][3] = SMALL_SNOWBALL;
        grid[2][4] = SNOWMAN_HEAD;
        grid[3][2] = TREE;
    }

    public void Level7() {
        currentLevel = 7;
        clearBoard();
        grid[0][2] = BIG_SNOWBALL;
        grid[0][4] = SMALL_SNOWBALL;
        grid[1][0] = SNOWMAN_HEAD;
        grid[2][2] = TREE;
        grid[2][3] = TREE;
    }

    public void Level8() {
        currentLevel = 8;
        clearBoard();
        grid[0][2] = SNOWMAN_HEAD;
        grid[1][0] = TREE;
        grid[3][0] = BIG_SNOWBALL;
        grid[3][1] = SMALL_SNOWBALL;
        grid[3][3] = TREE;
    }

    public void Level9() {
        currentLevel = 9;
        clearBoard();
        grid[0][0] = TREE;
        grid[0][3] = BIG_SNOWBALL;
        grid[2][1] = SNOWMAN_HEAD;
        grid[3][2] = SMALL_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level10() {
        currentLevel = 10;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[0][3] = SMALL_SNOWBALL;
        grid[1][1] = SNOWMAN_HEAD;
        grid[2][3] = TREE;
        grid[3][2] = TREE;
        grid[3][4] = TREE;
    }

    public void Level11() {
        currentLevel = 11;
        clearBoard();
        grid[0][4] = BIG_SNOWBALL;
        grid[1][0] = TREE;
        grid[1][4] = SMALL_SNOWBALL;
        grid[3][1] = SNOWMAN_HEAD;
        grid[3][3] = TREE;
        grid[3][4] = TREE;
    }

    public void Level12() {
        currentLevel = 12;
        clearBoard();
        grid[1][1] = SMALL_SNOWBALL;
        grid[1][3] = SNOWMAN_HEAD;
        grid[3][0] = TREE;
        grid[3][3] = BIG_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level13() {
        currentLevel = 13;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[2][0] = SNOWMAN_HEAD;
        grid[2][3] = TREE;
        grid[3][2] = SMALL_SNOWBALL;
        grid[3][4] = TREE;
    }

    public void Level14() {
        currentLevel = 14;
        clearBoard();
        grid[0][0] = BIG_SNOWBALL;
        grid[0][2] = SNOWMAN_HEAD;
        grid[1][4] = SMALL_SNOWBALL;
        grid[2][1] = TREE;
        grid[3][3] = TREE;
    }

    public void Level15() {
        currentLevel = 15;
        clearBoard();
        grid[0][2] = TREE;
        grid[1][4] = BIG_SNOWBALL;
        grid[2][0] = SNOWMAN_HEAD;
        grid[3][0] = SMALL_SNOWBALL;
        grid[3][3] = TREE;
        grid[3][4] = TREE;
    }

    public void Level16() {
        currentLevel = 16;
        clearBoard();
        grid[0][3] = TREE;
        grid[0][4] = BIG_SNOWBALL;
        grid[1][4] = SMALL_SNOWBALL;
        grid[2][0] = SNOWMAN_HEAD;
        grid[3][3] = TREE;
        grid[3][4] = TREE;
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
            newBoard.currentLevel = this.currentLevel; //the solver will the know which level belogns this way
        
        return newBoard;
    }
