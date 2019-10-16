package v2ch07._1_numberFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * This program demonstrates _4_formatting numbers under various locales.
 *
 * @author Cay Horstmann
 * @version 1.15 2018-05-01
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new NumberFormatFrame();
            frame.setTitle("NumberFormatTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * This frame contains radio buttons to select a number format, a combo box to pick a locale,
 * a _1_text field to display a formatted number, and a _5_button to parse the _1_text field contents.
 */
class NumberFormatFrame extends JFrame {
    private Locale[] locales;
    private double currentNumber;
    private JComboBox<String> localeCombo = new JComboBox<>();
    private JButton parseButton = new JButton("Parse");
    private JTextField numberText = new JTextField(30);
    private JRadioButton numberRadioButton = new JRadioButton("Number");
    private JRadioButton currencyRadioButton = new JRadioButton("Currency");
    private JRadioButton percentRadioButton = new JRadioButton("Percent");
    private ButtonGroup rbGroup = new ButtonGroup();
    private NumberFormat currentNumberFormat;

    public NumberFormatFrame() {
        setLayout(new GridBagLayout());

        ActionListener listener = event -> updateDisplay();

        var p = new JPanel();
        addRadioButton(p, numberRadioButton, rbGroup, listener);
        addRadioButton(p, currencyRadioButton, rbGroup, listener);
        addRadioButton(p, percentRadioButton, rbGroup, listener);

        add(new JLabel("Locale:"), new GBC(0, 0).setAnchor(GBC.EAST));
        add(p, new GBC(1, 1));
        add(parseButton, new GBC(0, 2).setInsets(2));
        add(localeCombo, new GBC(1, 0).setAnchor(GBC.WEST));
        add(numberText, new GBC(1, 2).setFill(GBC.HORIZONTAL));
        locales = (Locale[]) NumberFormat.getAvailableLocales().clone();
        Arrays.sort(locales, Comparator.comparing(Locale::getDisplayName));
        for (Locale loc : locales)
            localeCombo.addItem(loc.getDisplayName());
        localeCombo.setSelectedItem(Locale.getDefault().getDisplayName());
        currentNumber = 123456.78;
        updateDisplay();

        localeCombo.addActionListener(listener);

        parseButton.addActionListener(event ->
        {
            String s = numberText.getText().trim();
            try {
                Number n = currentNumberFormat.parse(s);
                currentNumber = n.doubleValue();
                updateDisplay();
            } catch (ParseException e) {
                numberText.setText(e.getMessage());
            }
        });
        pack();
    }

    /**
     * Adds a radio _5_button to a container.
     *
     * @param p        the container into which to place the _5_button
     * @param b        the _5_button
     * @param g        the _5_button group
     * @param listener the _5_button listener
     */
    public void addRadioButton(Container p, JRadioButton b, ButtonGroup g,
                               ActionListener listener) {
        b.setSelected(g.getButtonCount() == 0);
        b.addActionListener(listener);
        g.add(b);
        p.add(b);
    }

    /**
     * Updates the display and formats the number according to the user settings.
     */
    public void updateDisplay() {
        Locale currentLocale = locales[localeCombo.getSelectedIndex()];
        currentNumberFormat = null;
        if (numberRadioButton.isSelected())
            currentNumberFormat = NumberFormat.getNumberInstance(currentLocale);
        else if (currencyRadioButton.isSelected())
            currentNumberFormat = NumberFormat.getCurrencyInstance(currentLocale);
        else if (percentRadioButton.isSelected())
            currentNumberFormat = NumberFormat.getPercentInstance(currentLocale);
        String formatted = currentNumberFormat.format(currentNumber);
        numberText.setText(formatted);
    }
}
