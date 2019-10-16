package v1ch11._8_circleLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.34 2018-04-10
 * @author Cay Horstmann
 */
public class CircleLayoutTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new CircleLayoutFrame();
         frame.setTitle("CircleLayoutTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
