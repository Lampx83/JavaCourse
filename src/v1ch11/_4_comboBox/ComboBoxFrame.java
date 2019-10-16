package v1ch11._4_comboBox;

import javax.swing.*;
import java.awt.*;

/**
 * A frame with a sample _1_text label and a combo box for selecting _4_font faces.
 */
public class ComboBoxFrame extends JFrame {
    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 24;

    public ComboBoxFrame() {
        // add the sample _1_text label

        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        // make a combo box and add face names

        faceCombo = new JComboBox<>();
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");

        // the combo box listener changes the label _4_font to the selected face name

        faceCombo.addActionListener(event ->
                label.setFont(
                        new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),
                                Font.PLAIN, DEFAULT_SIZE)));

        // add combo box to a panel at the frame's southern border

        var comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);
        pack();
    }
}