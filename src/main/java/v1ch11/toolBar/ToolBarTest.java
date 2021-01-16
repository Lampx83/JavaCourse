package v1ch11.toolBar;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.15 2018-04-10
 */
public class ToolBarTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ToolBarFrame();
            frame.setTitle("ToolBarTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
