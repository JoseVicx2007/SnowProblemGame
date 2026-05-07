

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();         
        Game game = new Game(board);       
        GameGraphics gamegraphics = new GameGraphics(game);
        
        SwingUtilities.invokeLater(() -> new Window(gamegraphics));
    
}

}
