package v1ch10._6_mouse;

import javax.swing.*;

/**
 * A frame containing a panel for testing _6_mouse operations
 */
public class MouseFrame extends JFrame {
    public MouseFrame() {
        add(new MouseComponent());
        pack();
    }
}
