
import java.awt.Color;

import javax.swing.JFrame;

public class frames extends JFrame {
    graph board;

    frames() {
        board = new graph(750, 500, Color.BLUE);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);// make the window to appear in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(board);
        this.pack();
        this.setVisible(true);
    }

}