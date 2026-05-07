import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGraphics extends JPanel {

    private Game game;
    private int squareSize = 80;
    private int selectedRow = -1, selectedCol = -1;
    private ImageIcon[] images = new ImageIcon[7];
 public GameGraphics(Game game) {
        this.game = game;
        setPreferredSize(new Dimension(Board.COLS * squareSize, Board.ROWS * squareSize));
        setFocusable(true);
        loadImages();
        bindKeys();
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { handleClick(e); }
        });
    }

    private void loadImages() {
        images[Board.SMALL_SNOWBALL] = load("snowball_small.png");
        images[Board.BIG_SNOWBALL]   = load("snowball_large.png");
        images[Board.TREE]           = load("tree.png");
        images[Board.SNOWMAN_HEAD]   = load("head_blue.png");
        images[Board.SEMI_SNOWMAN]   = load("snowman_stack.png");
        images[Board.FULL_SNOWMAN]   = load("snowman_blue.png");
    }
    private ImageIcon load(String f) {
        return new ImageIcon("C:/Users/josev/.vscode/resources/" + f);
    }

    private void handleClick(MouseEvent e) {
        if (game.isGameOver() || game.isGameWon()) return;
        int col = e.getX() / squareSize;
        int row = e.getY() / squareSize;
        if (!game.getBoard().isInsideBoard(row, col)) return;

        // click same cell to deselect
        if (row == selectedRow && col == selectedCol) {
            selectedRow = selectedCol = -1;
        } else {
            int p = game.getBoard().getSquare(row, col);
            if (p == Board.SMALL_SNOWBALL || p == Board.BIG_SNOWBALL
                    || p == Board.SNOWMAN_HEAD || p == Board.SEMI_SNOWMAN) {
                selectedRow = row;
                selectedCol = col;
            }
        }
        repaint();
    }

    // key bindings because clikcing was difficult to move
    private void bindKeys() {
        bind("W", -1, 0); bind("S", 1, 0); bind("A", 0, -1); bind("D", 0, 1);
    }

    private void bind(String key, final int dr, final int dc) {
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("pressed " + key), key);
        getActionMap().put(key, new AbstractAction() {
            public void actionPerformed(ActionEvent e) { moveSelected(dr, dc); }
        });
    }

    private void moveSelected(int dr, int dc) {
        if (game.isGameOver() || game.isGameWon() || selectedRow == -1) return;
        // System.out.println("moving " + selectedRow + "," + selectedCol);
        game.moveSnowball(selectedRow, selectedCol, dr, dc);
        selectedRow = selectedCol = -1;
        repaint();

        if (game.isGameOver()) {
            JOptionPane.showMessageDialog(this, "Game over!");
            game.Retry();
        }
        if (game.isGameWon() && !game.nextLevelIfWon()) {
            JOptionPane.showMessageDialog(this, "You won all levels!");
        }
        repaint();
    }

protected void paintComponent(Graphics g) {
      super.paintComponent(g);
     int[][] grid = game.getBoard().getGrid();
      for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {
              int x = col * squareSize, y = row * squareSize;
                g.setColor(new Color(220, 238, 250));
                g.fillRect(x, y, squareSize, squareSize);
                g.setColor(Color.GRAY);
              g.drawRect(x, y, squareSize, squareSize);
                drawPiece(g, grid[row][col], x, y);
                if (row == selectedRow && col == selectedCol) {
                    g.setColor(Color.YELLOW);
                    g.drawRect(x + 3, y + 3, squareSize - 6, squareSize - 6);
                }
            }
        }
    }

    private void drawPiece(Graphics g, int piece, int x, int y) {
      if (piece == Board.EMPTY || images[piece] == null) return;
    int pad = piece == Board.TREE ? 2 : 8;
        g.drawImage(images[piece].getImage(), x + pad, y + pad,
                squareSize - pad * 2, squareSize - pad * 2, this);
    }
}
