import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameGraphics extends JPanel {

    private Game game;
    private int squareSize = 80;
    // header strip on top for level/moves/best + reset/scores buttons
    private int headerHeight = 30;
    private int selectedRow = -1;
    private int selectedCol = -1;
    private ImageIcon[] images = new ImageIcon[7];

    public GameGraphics(Game game) {
        this.game = game;
        // window is taller now, need to add headerHeight or the bottom row gets cut off
        setPreferredSize(new Dimension(Board.COLS * squareSize,
                Board.ROWS * squareSize + headerHeight));
        setFocusable(true);
        loadImages();
        bindKeys();

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                handleClick(e);
            }
        });
    }

    private void loadImages() {
        images[Board.SMALL_SNOWBALL] = loadImage("snowball_small.png");
        images[Board.BIG_SNOWBALL] = loadImage("snowball_large.png");
        images[Board.TREE] = loadImage("tree.png");
        images[Board.SNOWMAN_HEAD] = loadImage("head_blue.png");
        images[Board.SEMI_SNOWMAN] = loadImage("snowman_stack.png");
        images[Board.FULL_SNOWMAN] = loadImage("snowman_blue.png");
    }

    // FIXME: still hardcoded path. fix later
    private ImageIcon loadImage(String fileName) {
        return new ImageIcon("C:/Users/josev/.vscode/resources/" + fileName);
    }

    private void handleClick(MouseEvent e) {
        // forces focus or the keyboard stops working after clicking the buttons
        requestFocusInWindow();

        // header click goes to the buttons up there, not the board
        if (e.getY() < headerHeight) {
            handleHeaderClick(e.getX());
            return;
        }

        if (game.isGameOver() || game.isGameWon()) return;

        int col = e.getX() / squareSize;
        // subtract headerHeight or every click thinks it's one row higher than it is
        int row = (e.getY() - headerHeight) / squareSize;

        if (!game.getBoard().isInsideBoard(row, col)) return;

        if (row == selectedRow && col == selectedCol) {
            selectedRow = selectedCol = -1;
            repaint();
            return;
        }

        int piece = game.getBoard().getSquare(row, col);
        if (piece == Board.SMALL_SNOWBALL
                || piece == Board.BIG_SNOWBALL
                || piece == Board.SEMI_SNOWMAN) {
            selectedRow = row;
            selectedCol = col;
            repaint();
        }
    }

    private void bindKeys() {
        bind("pressed W", -1, 0);
        // arrow keys too because not everyone uses WASD
        bind("pressed UP", -1, 0);
        bind("pressed S", 1, 0);
        bind("pressed DOWN", 1, 0);
        bind("pressed A", 0, -1);
        bind("pressed LEFT", 0, -1);
        bind("pressed D", 0, 1);
        bind("pressed RIGHT", 0, 1);

        // R = reset, H = scores. quicker than reaching for the buttons every time
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("pressed R"), "reset");
        getActionMap().put("reset", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                resetLevel();
            }
        });

        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("pressed H"), "scores");
        getActionMap().put("scores", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                showHighScores();
            }
        });
    }

    private void bind(String key, final int rowChange, final int colChange) {
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key), key);
        getActionMap().put(key, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                moveSelected(rowChange, colChange);
            }
        });
    }

    private void moveSelected(int rowChange, int colChange) {
        if (game.isGameOver() || game.isGameWon() || selectedRow == -1) return;

        game.moveSnowball(selectedRow, selectedCol, rowChange, colChange);
        selectedRow = selectedCol = -1;
        repaint();

        if (game.isGameOver()) {
            JOptionPane.showMessageDialog(this, "Game over!");
            game.Retry();
        }
        if (game.isGameWon()) {
            // small delay so the player actually sees the snowman before the next level loads
            Timer timer = new Timer(1000, e -> {
                if (!game.nextLevelIfWon()) {
                    JOptionPane.showMessageDialog(this, "You won all levels!");
                }
                repaint();
            });
            timer.setRepeats(false);
            timer.start();
        }
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawHeader(g);
        drawBoard(g);
    }

    // hit boxes were guessed by trial and error, change carefully
    private void handleHeaderClick(int x) {
        if (x >= getWidth() - 130 && x < getWidth() - 70) {
            resetLevel();
        } else if (x >= getWidth() - 65 && x < getWidth() - 5) {
            showHighScores();
        }
    }

    private void resetLevel() {
        game.resetCurrentLevel();
        selectedRow = selectedCol = -1;
        repaint();
    }

    private void showHighScores() {
        JOptionPane.showMessageDialog(this, game.getHighScoreTable(),
                "High Scores", JOptionPane.INFORMATION_MESSAGE);
    }

    private void drawHeader(Graphics g) {
        g.setColor(new Color(40, 55, 70));
        g.fillRect(0, 0, getWidth(), headerHeight);

        g.setColor(Color.WHITE);
        // show "-" instead of "0" if no score yet, looks weird otherwise
        String best = game.getBestMoves() == 0 ? "-" : "" + game.getBestMoves();
        g.drawString("Level " + game.getBoard().getCurrentLevel()
                + "  Moves: " + game.getMoveCount()
                + "  Best: " + best, 8, 20);

       
        g.drawRect(getWidth() - 130, 6, 60, 18);
        g.drawString("Reset", getWidth() - 120, 20);
        g.drawRect(getWidth() - 65, 6, 60, 18);
        g.drawString("Scores", getWidth() - 58, 20);
    }

    private void drawBoard(Graphics g) {
        int[][] grid = game.getBoard().getGrid();

        for (int row = 0; row < Board.ROWS; row++) {
            for (int col = 0; col < Board.COLS; col++) {

                int x = col * squareSize;
                // shifted down to leave room for the header
                int y = row * squareSize + headerHeight;

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
        if (piece == Board.EMPTY || images[piece] == null) {
            return;
        }

        int padding = piece == Board.TREE ? 2 : 8;
        g.drawImage(images[piece].getImage(), x + padding, y + padding,
                squareSize - padding * 2, squareSize - padding * 2, this);
    }
}
