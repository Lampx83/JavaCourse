package v2ch11._5_tree;

import javax.swing.*;
import java.awt.*;

/**
 * This program shows a simple tree.
 *
 * @author Cay Horstmann
 * @version 1.04 2018-05-01
 */
public class SimpleTree {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new SimpleTreeFrame();
            frame.setTitle("SimpleTree");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
