package v1ch03._2_InputTest;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        //Tạo ra đối tượng in để nhập liệu
        Scanner in = new Scanner(System.in);

        //Nhập tên vào biến tên
        System.out.println("Hãy nhập tên của bạn:");
        String ten = in.nextLine();

        //Nhập tuổi vào biển tuoi
        System.out.println("Hãy nhập tuổi của bạn:");
        int tuoi = in.nextInt();


        //In tên ra ma màn hình
        System.out.println("Tên của bạn là : " + ten);
        System.out.println("Năm sau bạn sẽ " + (tuoi + 1) + " tuổi");


//
//      System.out.print("What is your name? ");
//      String name = in.nextLine();
//
//      // get second input
//      System.out.print("How old are you? ");
//      int age = in.nextInt();
//
//      // display output on console
//      System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
