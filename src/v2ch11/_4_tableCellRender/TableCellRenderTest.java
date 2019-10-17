package v2ch11._4_tableCellRender;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates cell rendering and editing in a table.
 *
 * @author Cay Horstmann
 * @version 1.05 2018-05-01
 */
public class TableCellRenderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {

            var frame = new TableCellRenderFrame();
            frame.setTitle("TableCellRenderTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
