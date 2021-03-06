package v2ch07._5_retire;

import java.awt.*;

/**
 * These are the English non-string resources for the retirement calculator.
 *
 * @author Cay Horstmann
 * @version 1.21 2001-08-27
 */
public class RetireResources_en_US extends java.util.ListResourceBundle {
    private static final Object[][] contents = {
            // BEGIN LOCALIZE
            {"colorPre", Color.blue}, {"colorGain", Color.white}, {"colorLoss", Color.red}
            // END LOCALIZE
    };

    public Object[][] getContents() {
        return contents;
    }
}
