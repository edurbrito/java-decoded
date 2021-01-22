package MovingRectangles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

import MovingRectangles.RectangleComponent;

/**
 * 7 This frame contains a moving rectangle. 8
 */
public class RectangleFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent scene;

    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            scene.moveRectangleBy(-1, 1);
        }
    }

    public RectangleFrame() {
        scene = new RectangleComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();

        final int DELAY = 100; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}