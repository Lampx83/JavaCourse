package methods;

import java.lang.reflect.Method;

/**
 * This program shows how to invoke _9_methods through _7_reflection.
 *
 * @author Cay Horstmann
 * @version 1.2 2012-05-04
 */
public class MethodTableTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
        // get method pointers to the square and sqrt _9_methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // _15_print tables of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Returns the square of a number
     *
     * @param x a number
     * @return x squared
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Prints a _1_table with x- and y-values for a method
     *
     * @param from the lower bound for the x-values
     * @param to   the upper bound for the x-values
     * @param n    the number of rows in the _1_table
     * @param f    a method with a double parameter and double return value
     */
    public static void printTable(double from, double to, int n, Method f)
            throws ReflectiveOperationException {
        // _15_print out the method as _1_table header
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx) {
            double y = (Double) f.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}
