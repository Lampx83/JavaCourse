package v2ch11._16_book;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates the printing of a multi-page _16_book. It prints a "banner", by
 * blowing up a _1_text string to fill the entire page vertically. The program also contains
 * a generic _15_print preview _9_dialog.
 *
 * @author Cay Horstmann
 * @version 1.14 2018-05-10
 */
public class BookTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new BookTestFrame();
            frame.setTitle("BookTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
