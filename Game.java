public class Game {

    private Board board;
    private boolean gameOver;
    private boolean gameWon;
    public Game(Board board) {
        this.board = board;
        this.gameOver = false;
        this.gameWon = false;
    }

 public Board getBoard() {
        return board;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isGameWon() {
        return gameWon;
    }


    // puts level back to the start
    public void ReturntoTheBeggining() {
        board.Level1();
        gameOver = false;
        gameWon = false;
    }

    public void moveUp(int row, int col) {
        moveSnowball(row, col, -1, 0);
    }

    public void moveDown(int row, int col) {
        moveSnowball(row, col, 1, 0);
    }

    public void moveLeft(int row, int col) {
        moveSnowball(row, col, 0, -1);
    }

    public void moveRight(int row, int col) {
        moveSnowball(row, col, 0, 1);
    }

    // main movement system for all snowballs
    public void moveSnowball(int row, int col, int rowChange, int colChange) {

        // stop movement if game already ended
        if (gameOver || gameWon) {
            return;
        }

        int piece = board.getSquare(row, col);

        // only snowball pieces can move
        if (piece != Board.SMALL_SNOWBALL
                && piece != Board.BIG_SNOWBALL
                && piece != Board.SNOWMAN_HEAD) {
            return;
        }

        int currentRow = row;
        int currentCol = col;

        // keeps moving, not just one square
        while (true) {

            int nextRow = currentRow + rowChange;
            int nextCol = currentCol + colChange;

            // if piece goes outside map player loses
            if (!board.isInsideBoard(nextRow, nextCol)) {

                board.clearSquare(row, col); // remove original piece

                gameOver = true;

                return;
            }

            int nextPiece = board.getSquare(nextRow, nextCol);

            // continue sliding if empty square
            if (nextPiece == Board.EMPTY) {
                currentRow = nextRow;
                currentCol = nextCol;
                continue;
            }

            // tree blocks movement
            if (nextPiece == Board.TREE) {

                if (currentRow != row || currentCol != col) {
                    board.Placer(currentRow, currentCol, piece); // keep original naming
                    board.Replacer(row, col);
                    moveCount++;
                }

                checkWin();
                return;
            }

            // combines snowball pieces together
            int transformed = StackSnow(piece, nextPiece);

            if (transformed != -1) {

                board.Placer(nextRow, nextCol, transformed);
                board.Replacer(row, col); 
               checkWin();
                return;
            }

            // blocked by something we don't handle yet
            return;
        }
    }

    // creates snowman parts from combinations
    private int StackSnow(int moving, int target) {

        if (moving == Board.SMALL_SNOWBALL && target == Board.BIG_SNOWBALL) {
            return Board.SEMI_SNOWMAN;
        }

        if (moving == Board.SNOWMAN_HEAD && target == Board.SEMI_SNOWMAN) {
            return Board.FULL_SNOWMAN;
        }

        return -1;
    }

    // checks if all pieces are completed
    private void checkWin() {

        int[][] grid = board.getGrid(); //returns the grid from Board.java

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {

                int piece = grid[row][col];

                // unfinished pieces means game still going
                if (piece == Board.SMALL_SNOWBALL
                        || piece == Board.BIG_SNOWBALL
                        || piece == Board.SNOWMAN_HEAD
                        || piece == Board.SEMI_SNOWMAN) {

                    gameWon = false;
                    return;
                }
            }
        }

        // no unfinished pieces left so player wins
        gameWon = true;
    }

              // resets
              public void resetGame() {
        board = new Board();
        gameOver = false;
        gameWon = false;
    }

    // retry only after losing
        public void Retry() {   
        if (gameOver) {
            board.Level1();
            gameOver = false;
        }
    }
}
