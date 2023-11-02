package test;

import list.Node;
import list.MyList;
import java.util.Scanner;

public class Program {
    static Scanner myKeyBoard = new Scanner(System.in);
    static Node head = null;

    public static void main(String[] args) {
        MyList list = new MyList();
        boolean run = true;

        while (run) {
            System.err.println("=============== Quản lý laptop ===============");
            System.err.println("|1. Thêm laptop vào đầu danh sách             |");
            System.err.println("|2. Giảm giá các laptop của hãng Acer         |");
            System.err.println("|3. Lấy danh sách laptop có màu gray          |");
            System.err.println("|4. Xóa các laptop ở đầu danh sách            |");
            System.err.println("|5. Sắp xếp danh sách laptop theo giá tăng dần|");
            System.err.println("|0. Thoát chương trình                        |");
            System.err.println("==============================================");
            System.err.print("Nhập lựa chọn của bạn: ");
            int choice = myKeyBoard.nextInt();
            myKeyBoard.nextLine();

            switch (choice) {
                case 0:
                    run = false;
                    break;
                case 1:
                    MyList.add();
                    break;
                case 2:
                    MyList.reduce();
                    break;
                case 3:
                    MyList.print();
                    break;
                case 4:
                    MyList.delete();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            if (run) {
                System.out.println();
                System.out.print("Nhấn Enter để tiếp tục...");
                myKeyBoard.nextLine();
                System.out.println();
            }
        }
    }
}
