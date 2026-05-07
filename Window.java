import javax.swing.JFrame;   //Very important for GUI logic

public class Window extends JFrame {

    public Window(GameGraphics graphics) { 
        add(graphics);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Snow Problem");
        setVisible(true);
        graphics.requestFocusInWindow();
    }

    public static void main(String[] args) { //This class does not need anymore changes
        Board board = new Board();
        Game game = new Game(board);
        GameGraphics graphics = new GameGraphics(game);
        new Window(graphics);
    }
}
