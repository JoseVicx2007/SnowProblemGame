import java.util.prefs.Preferences;

public class Game {

    private Board board;
    private Preferences highScores;
    private boolean gameOver;
    private boolean gameWon;
    private boolean newHighScore;
    private int moveCount;

    public Game(Board board) {
        this.board = board;
        this.highScores = Preferences.userRoot().node("snow_problem_high_scores");
        resetLevelState();
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

    public int getMoveCount() {
        return moveCount;
    }

    public int getBestMoves() {
        return highScores.getInt("level" + board.getCurrentLevel(), 0);
    }

    public boolean hasNewHighScore() {
        return newHighScore;
    }

    public String getHighScoreTable() {
        String table = "Level   Best moves\n";

        for (int level = 1; level <= Board.MAX_LEVEL; level++) {
            int bestMoves = highScores.getInt("level" + level, 0);
            table += level + "       " + (bestMoves == 0 ? "-" : bestMoves) + "\n";
        }

        return table;
    }

    public boolean nextLevelIfWon() {
        if (!gameWon || board.getCurrentLevel() == Board.MAX_LEVEL) {
            return false;
        }

        board.loadLevel(board.getCurrentLevel() + 1);
        resetLevelState();
        return true;
    }

    public void ReturntoTheBeggining() {
        resetCurrentLevel();
    }

    public void resetCurrentLevel() {
        board.loadLevel(board.getCurrentLevel());
        resetLevelState();
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

        if (piece != Board.SMALL_SNOWBALL
                && piece != Board.BIG_SNOWBALL
                && piece != Board.SEMI_SNOWMAN) {
            return;
        }

        int currentRow = row;
        int currentCol = col;

        // keeps moving untill object hits something
        while (true) {

            int nextRow = currentRow + rowChange;
            int nextCol = currentCol + colChange;

            // if piece goes outside map player loses
            if (!board.isInsideBoard(nextRow, nextCol)) {

                board.clearSquare(row, col);
                moveCount++;
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

            // combines snowball pieces together
            int transformed = StackSnow(piece, nextPiece);

            if (transformed != -1) {
                board.Placer(nextRow, nextCol, transformed);
            } else if (currentRow != row || currentCol != col) {
                board.Placer(currentRow, currentCol, piece);
            } else {
                return;
            }

            board.clearSquare(row, col);
            moveCount++;
            checkWin();

            return;
        }
    }

    // creates snowman parts from combinations
    private int StackSnow(int moving, int target) {

        if ((moving == Board.SMALL_SNOWBALL && target == Board.BIG_SNOWBALL)
                || (moving == Board.BIG_SNOWBALL && target == Board.SMALL_SNOWBALL)) {
            return Board.SEMI_SNOWMAN;
        }

        if (moving == Board.SEMI_SNOWMAN && target == Board.SNOWMAN_HEAD) {
            return Board.FULL_SNOWMAN;
        }

        return -1;
    }

    // checks if all pieces are completed
    private void checkWin() {

        int fullSnowmen = 0;
        int[][] grid = board.getGrid();

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
                if (grid[row][col] == Board.FULL_SNOWMAN) {
                    fullSnowmen++;
                }
            }
        }

        if (fullSnowmen >= board.getSnowmenNeeded()) {
            gameWon = true;
            saveHighScore();
        } else {
            gameWon = false;
        }
    }

    public void resetGame() {

        board = new Board();
        resetLevelState();
    }

    public void Retry() {

        if (gameOver) {
            resetCurrentLevel();
        }
    }

    private void resetLevelState() {
        gameOver = false;
        gameWon = false;
        newHighScore = false;
        moveCount = 0;
    }

    private void saveHighScore() {
        String key = "level" + board.getCurrentLevel();
        int bestMoves = highScores.getInt(key, 0);

        if (bestMoves == 0 || moveCount < bestMoves) {
            highScores.putInt(key, moveCount);
            newHighScore = true;
        }
    }
}

