package v2ch12._5_printf3;

import java.io.PrintWriter;

/**
 * @author Cay Horstmann
 * @version 1.10 1997-07-01
 */
class Printf3 {
    public static native void fprint(PrintWriter out, String format, double x);

    static {
        System.loadLibrary("Printf3");
    }
}
