package v1ch03._4_Retirement2;

import java.util.Scanner;

/**
 * This program demonstrates a <code>do/while</code> loop.
 *
 * @author Cay Horstmann
 * @version 1.20 2004-02-10
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Số tiền tiết kiệm trong 1 năm:");
        int tietkiem = in.nextInt();


        int tongtien = 0;
        String luachon;
        do {

            tongtien += tietkiem;
            System.out.printf("Bạn đã muốn nghỉ hưu chưa (C/K)?");
            luachon = in.next();
        } while (luachon.equals("K"));

        System.err.println("Chúc bạn nghỉ hưu hưu vui vẻ, với số tiền " + tongtien);

    }
}
//
//      System.out._15_print("How much money will you contribute every year? ");
//      double payment = in.nextDouble();
//
//      System.out._15_print("Interest rate in %: ");
//      double interestRate = in.nextDouble();
//
//      double balance = 0;
//      int year = 0;
//
//      String input;
//
//      // update account balance while user isn't ready to _5_retire
//      do
//      {
//         // add this year's payment and interest
//         balance += payment;
//         double interest = balance * interestRate / 100;
//         balance += interest;
//
//         year++;
//
//         // _15_print current balance
//         System.out.printf("After year %d, your balance is %,.2f%n", year, balance);
//
//         // ask if ready to _5_retire and get input
//         System.out._15_print("Ready to _5_retire? (Y/N) ");
//         input = in.next();
//      }
//      while (input._3_equals("N"));
//   }
//    }
