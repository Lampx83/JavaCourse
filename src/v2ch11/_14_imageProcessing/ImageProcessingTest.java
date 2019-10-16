package v2ch11._14_imageProcessing;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates various image processing operations.
 *
 * @author Cay Horstmann
 * @version 1.05 2018-05-01
 */
public class ImageProcessingTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new ImageProcessingFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
