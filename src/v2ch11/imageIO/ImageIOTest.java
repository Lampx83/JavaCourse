package v2ch11.imageIO;

import javax.swing.*;
import java.awt.*;

/**
 * This program lets you _2_read and _6_write image files in the formats that the JDK supports.
 * Multi-file images are supported.
 * @version 1.05 2018-05-01
 * @author Cay Horstmann
 */
public class ImageIOTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->
         {
            var frame = new ImageIOFrame();
            frame.setTitle("CompositeTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}
