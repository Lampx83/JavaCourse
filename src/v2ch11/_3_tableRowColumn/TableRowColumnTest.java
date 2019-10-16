package v2ch11._3_tableRowColumn;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates how to work with rows and columns in a _1_table.
 *
 * @author Cay Horstmann
 * @version 1.23 2018-05-01
 */
public class TableRowColumnTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new PlanetTableFrame();
            frame.setTitle("TableRowColumnTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
