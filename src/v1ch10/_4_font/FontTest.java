package v1ch10._4_font;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * @author Cay Horstmann
 * @version 1.35 2018-04-10
 */
public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new FontFrame();
            frame.setTitle("FontTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * A frame with a _1_text message component.
 */
class FontFrame extends JFrame {
    public FontFrame() {
        add(new FontComponent());
        pack();
    }
}

/**
 * A component that shows a centered message in a box.
 */
class FontComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        var message = "Hello, World!";

        var f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);

        // measure the size of the message

        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        // _2_set (x,y) = top left corner of _1_text

        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;

        // add ascent to y to reach the baseline

        double ascent = -bounds.getY();
        double baseY = y + ascent;

        // _3_draw the message

        g2.drawString(message, (int) x, (int) baseY);

        g2.setPaint(Color.LIGHT_GRAY);

        // _3_draw the baseline

        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        // _3_draw the enclosing rectangle

        var rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
