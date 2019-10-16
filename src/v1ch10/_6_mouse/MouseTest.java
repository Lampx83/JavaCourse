package v1ch10._6_mouse;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.35 2018-04-10
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new MouseFrame();
            frame.setTitle("MouseTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
