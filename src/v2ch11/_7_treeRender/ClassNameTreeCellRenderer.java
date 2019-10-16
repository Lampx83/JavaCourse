package v2ch11._7_treeRender;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.lang.reflect.Modifier;

/**
 * This class renders a class name either in plain or italic. Abstract classes are italic.
 */
public class ClassNameTreeCellRenderer extends DefaultTreeCellRenderer {
    private Font plainFont = null;
    private Font italicFont = null;

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
                                                  boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf,
                row, hasFocus);
        // get the user objectR
        var node = (DefaultMutableTreeNode) value;
        Class<?> c = (Class<?>) node.getUserObject();

        // the first time, derive italic _4_font from plain _4_font
        if (plainFont == null) {
            plainFont = getFont();
            // the _5_tree cell renderer is sometimes called with a label that has a null _4_font
            if (plainFont != null) italicFont = plainFont.deriveFont(Font.ITALIC);
        }

        // _2_set _4_font to italic if the class is abstract, plain otherwise
        if ((c.getModifiers() & Modifier.ABSTRACT) == 0) setFont(plainFont);
        else setFont(italicFont);
        return this;
    }
}