import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solver {

    private static final int[][] waysToGo = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    private static final String[] wayNames = {"up", "down", "left", "right"};

    public Solution solve(Board board, int maxMoves) {
        int[][] startBoard = copyBoard(board.getGrid());
        int snowmanNeeded = countHeads(startBoard);

        Queue<GamePlace> placesToLook = new LinkedList<>();
        HashSet<String> alredySeen = new HashSet<>();

        placesToLook.add(new GamePlace(startBoard, new ArrayList<Move>()));
        alredySeen.add(makeKey(startBoard));

        int checked = 0;

        while (!placesToLook.isEmpty()) {
          GamePlace now = placesToLook.remove();
            checked++;

            if (isWon(now.board, snowmanNeeded)) {
                return new Solution(true, now.moves, checked);
            }

            if (now.moves.size() >= maxMoves) {
                continue;
            }

            for (int row = 0; row < Board.ROWS; row++) {
                for (int col = 0; col < Board.COLS; col++) {
                    if (!canMove(now.board[row][col])) continue;

                    for (int way = 0; way < waysToGo.length; way++) {
                        int[][] newBoard = movePiece(now.board, row, col,
                                waysToGo[way][0], waysToGo[way][1]);

                        if (newBoard == null) continue;

                        String key = makeKey(newBoard);
                        if (alredySeen.contains(key)) continue;

                        ArrayList<Move> newMoves = new ArrayList<Move>(now.moves);
                        newMoves.add(new Move(row, col, wayNames[way]));

                        placesToLook.add(new GamePlace(newBoard, newMoves));
                        alredySeen.add(key);
                    }
                }
            }
        }

        return new Solution(false, new ArrayList<Move>(), checked);
    }

    private int[][] movePiece(int[][] board, int row, int col, int rowChange, int colChange) {
        int piece = board[row][col];
        int rowNow = row;
        int colNow = col;

        while (true) {
            int nextRow = rowNow + rowChange;
            int nextCol = colNow + colChange;

            if (!inside(nextRow, nextCol)) {
                return null;
            }

            int nextThing = board[nextRow][nextCol];

            if (nextThing == Board.EMPTY) {
                rowNow = nextRow;
                colNow = nextCol;
                continue;
            }

            int madeThing = makeSnowmanPart(piece, nextThing);
            int[][] newBoard = copyBoard(board);

            if (madeThing != -1) {
                newBoard[nextRow][nextCol] = madeThing;
            } else if (rowNow != row || colNow != col) {
                newBoard[rowNow][colNow] = piece;
            } else {
              return null;
            }

            newBoard[row][col] = Board.EMPTY;
            return newBoard;
        }
    }

    private int makeSnowmanPart(int moving, int hit) {
        if ((moving == Board.SMALL_SNOWBALL && hit == Board.BIG_SNOWBALL)
                || (moving == Board.BIG_SNOWBALL && hit == Board.SMALL_SNOWBALL)) {
            return Board.SEMI_SNOWMAN;
        }

        if (moving == Board.SEMI_SNOWMAN && hit == Board.SNOWMAN_HEAD) {
            return Board.FULL_SNOWMAN;
        }

        return -1;
    }

    private boolean canMove(int piece) {
        return piece == Board.SMALL_SNOWBALL
                || piece == Board.BIG_SNOWBALL
                || piece == Board.SEMI_SNOWMAN;
    }

    private boolean inside(int row, int col) {
        return row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS;
    }

    private boolean isWon(int[][] board, int snowmanNeeded) {
        int fullSnowmen = 0;

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
                if (board[row][col] == Board.FULL_SNOWMAN) {
                    fullSnowmen++;
                }
            }
        }

        return fullSnowmen >= snowmanNeeded;
    }

    private int countHeads(int[][] board) {
        int heads = 0;

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
                if (board[row][col] == Board.SNOWMAN_HEAD
                        || board[row][col] == Board.FULL_SNOWMAN) {
                    heads++;
                }
            }
        }

        return heads;
    }

    private int[][] copyBoard(int[][] oldBoard) {
        int[][] newBoard = new int[Board.ROWS][Board.COLS];

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
                newBoard[row][col] = oldBoard[row][col];
            }
        }

        return newBoard;
    }

    private String makeKey(int[][] board) {
        String key = "";

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
                key += board[row][col];
            }
        }

        return key;
    }

    private static class GamePlace {
        int[][] board;
        ArrayList<Move> moves;

        GamePlace(int[][] board, ArrayList<Move> moves) {
            this.board = board;
            this.moves = moves;
        }
    }

    public static class Move {
        int row;
        int col;
        String direction;

        Move(int row, int col, String direction) {
            this.row = row;
            this.col = col;
            this.direction = direction;
        }

        public String toString() {
            return "(" + row + ", " + col + ") " + direction;
        }
    }

    public static class Solution {
        boolean solved;
        List<Move> moves;
        int checked;

        Solution(boolean solved, List<Move> moves, int checked) {
            this.solved = solved;
            this.moves = moves;
            this.checked = checked;
        }

        public String toString() {
            String answer;

            if (solved) {
                answer = "Solved in " + moves.size() + " moves";
            } else {
                answer = "No solution found";
            }

            answer += "\nChecked boards: " + checked;

            for (int i = 0; i < moves.size(); i++) {
                answer += "\n" + (i + 1) + ". " + moves.get(i);
            }

            return answer;
        }
    }
}
