import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewClass {

    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;
    public static final int SCALE = 3;

    public static void main(String[] args) {

        JFrame window = new JFrame("Prova");
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        p.setFocusable(true);
        p.requestFocus();
        window.add(p);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}