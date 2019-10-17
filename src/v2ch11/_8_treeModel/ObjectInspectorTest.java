package v2ch11._8_treeModel;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates how to use a custom tree model. It displays the fields of an object.
 *
 * @author Cay Horstmann
 * @version 1.06 2018-05-01
 */
public class ObjectInspectorTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new ObjectInspectorFrame();
            frame.setTitle("ObjectInspectorTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}



