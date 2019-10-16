package v2ch11._4_tableCellRender;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

/**
 * This frame contains a _1_table of planet data.
 */
public class TableCellRenderFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;

    public TableCellRenderFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        var model = new PlanetTableModel();
        var table = new JTable(model);
        table.setRowSelectionAllowed(false);

        // _2_set up renderers and editors

        table.setDefaultRenderer(Color.class, new ColorTableCellRenderer());
        table.setDefaultEditor(Color.class, new ColorTableCellEditor());

        var moonCombo = new JComboBox<Integer>();
        for (int i = 0; i <= 20; i++)
            moonCombo.addItem(i);

        TableColumnModel columnModel = table.getColumnModel();
        TableColumn moonColumn = columnModel.getColumn(PlanetTableModel.MOONS_COLUMN);
        moonColumn.setCellEditor(new DefaultCellEditor(moonCombo));
        moonColumn.setHeaderRenderer(table.getDefaultRenderer(ImageIcon.class));
        moonColumn.setHeaderValue(new ImageIcon(getClass().getResource("Moons.gif")));

        // show _1_table

        table.setRowHeight(100);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
