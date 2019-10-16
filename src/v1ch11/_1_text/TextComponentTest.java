package v1ch11._1_text;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.42 2018-04-10
 */
public class TextComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new TextComponentFrame();
            frame.setTitle("TextComponentTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
