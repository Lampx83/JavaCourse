package v1ch03._3_Retirement;

import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop.
 *
 * @author Cay Horstmann
 * @version 1.20 2004-02-10
 */
public class Retirement {
    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);

        System.out.print("Bạn cần bao nhiêu tiền khi nghỉ hưu:");
        float muctieu = nhap.nextFloat();


        System.out.print("Số tiền để dành mỗi tháng của bạn:");
        float tietkiem = nhap.nextFloat();

        int nam = 0;
        float tongtien = 0;

        while (tongtien < muctieu) {
            nam++;
            tongtien = tongtien + tietkiem;
        }

        System.out.print("Bạn có thể nghỉ hưu sau " + nam + " năm");


//      // read inputs
//      Scanner in = new Scanner(System.in);
//
//      System.out.print("How much money do you need to retire? ");
//      double goal = in.nextDouble();
//
//      System.out.print("How much money will you contribute every year? ");
//      double payment = in.nextDouble();
//
//      System.out.print("Interest rate in %: ");
//      double interestRate = in.nextDouble();
//
//      double balance = 0;
//      int years = 0;
//
//      // update account balance while goal isn't reached
//      while (balance < goal)
//      {
//         // add this year's payment and interest
//         balance += payment;
//         double interest = balance * interestRate / 100;
//         balance += interest;
//         years++;
//      }
//
//      System.out.println("You can retire in " + years + " years.");
    }
}
