package v1ch03._5_LotteryOdds;

import java.math.BigInteger;
import java.util.*;

/**
 * This program demonstrates a <code>for</code> loop.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryOdds
{
   public static void main(String[] args)
   {
      BigInteger b = new BigInteger("12229393895949292392392312423057340238428402340238402384023804182391222939389594929239239231242305734023842840234023840238402380418239");

      BigInteger a = new BigInteger("02384023804182391222939389594929239239231242305734023842840234023840238402380418239");


      BigInteger c = b.multiply(a);

      System.out.print(c);


   }
}





