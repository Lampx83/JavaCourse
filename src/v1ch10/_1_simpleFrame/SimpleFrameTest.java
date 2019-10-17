package v1ch10._1_simpleFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.34 2018-04-10
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame f = new JFrame();//creating instance of JFrame

            JButton b = new JButton("click");//creating instance of JButton
            b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
            f.add(b);//adding button in JFrame

            f.setSize(400, 500);//400 width and 500 height
            f.setLayout(null);//using no layout managers
            f.setVisible(true);//making the frame visible
        });
    }
}

class SimpleFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
