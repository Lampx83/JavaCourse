package v2ch12._6_printf4;

import java.io.PrintWriter;

/**
 * @author Cay Horstmann
 * @version 1.10 1997-07-01
 */
class Printf4 {
    public static native void fprint(PrintWriter ps, String format, double x);

    static {
        System.loadLibrary("Printf4");
    }
}
