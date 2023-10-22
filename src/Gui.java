import javax.swing.*;
import java.awt.*;

public class Gui extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paintComponent some methods
        // write first will be covered by the ones written later
        g.drawString("Hello world", 100, 100);
        g.drawLine(50, 30, 20, 60);
        g.drawRect(100, 100, 40, 70);
        g.setColor(Color.ORANGE);
        g.fillOval(10, 10, 100, 100);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new Gui());
        window.setVisible(true);
    }
}
