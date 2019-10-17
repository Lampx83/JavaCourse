package v2ch10._1_classLoader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Encrypts a file using the Caesar cipher.
 *
 * @author Cay Horstmann
 * @version 1.02 2018-05-01
 */
public class Caesar {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("USAGE: java classLoader.Caesar in out key");
            return;
        }

        try (var in = new FileInputStream(args[0]);
             var out = new FileOutputStream(args[1])) {
            int key = Integer.parseInt(args[2]);
            int ch;
            while ((ch = in.read()) != -1) {
                byte c = (byte) (ch + key);
                out.write(c);
            }
        }
    }
}
