import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FrameViewer {
    public static class Animation extends JComponent {
        private static final long serialVersionUID = 1L;

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.drawString("NEW FRAME", 50, 100);

        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1000, 500);
        frame.setAutoRequestFocus(true);
        frame.setLocation(100, 50);
        frame.setTitle("New Frame");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Animation anim = new Animation();

        frame.add(anim);

        frame.setVisible(true);

    }

}