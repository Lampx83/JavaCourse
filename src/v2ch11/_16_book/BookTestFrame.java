package v2ch11._16_book;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.*;
import java.awt.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * This frame has a _1_text field for the banner _1_text and buttons for printing, page setup, and
 * _15_print preview.
 */
public class BookTestFrame extends JFrame {
    private JTextField text;
    private PageFormat pageFormat;
    private PrintRequestAttributeSet attributes;

    public BookTestFrame() {
        text = new JTextField();
        add(text, BorderLayout.NORTH);

        attributes = new HashPrintRequestAttributeSet();

        var buttonPanel = new JPanel();

        var printButton = new JButton("Print");
        buttonPanel.add(printButton);
        printButton.addActionListener(event ->
        {
            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPageable(makeBook());
                if (job.printDialog(attributes)) {
                    job.print(attributes);
                }
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(BookTestFrame.this, e);
            }
        });

        var pageSetupButton = new JButton("Page setup");
        buttonPanel.add(pageSetupButton);
        pageSetupButton.addActionListener(event ->
        {
            PrinterJob job = PrinterJob.getPrinterJob();
            pageFormat = job.pageDialog(attributes);
        });

        var printPreviewButton = new JButton("Print preview");
        buttonPanel.add(printPreviewButton);
        printPreviewButton.addActionListener(event ->
        {
            var dialog = new PrintPreviewDialog(makeBook());
            dialog.setVisible(true);
        });

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    /**
     * Makes a _16_book that contains a cover page and the pages for the banner.
     */
    public Book makeBook() {
        if (pageFormat == null) {
            PrinterJob job = PrinterJob.getPrinterJob();
            pageFormat = job.defaultPage();
        }
        var book = new Book();
        String message = text.getText();
        var banner = new Banner(message);
        int pageCount = banner.getPageCount((Graphics2D) getGraphics(), pageFormat);
        book.append(new CoverPage(message + " (" + pageCount + " pages)"), pageFormat);
        book.append(banner, pageFormat, pageCount);
        return book;
    }
}
