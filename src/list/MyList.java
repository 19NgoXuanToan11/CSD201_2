package list;

import obj.Laptop;
import java.util.Scanner;

public class MyList {
    private static Scanner myKeyBoard = new Scanner(System.in);
    private static Node head;
    private static int size = 0;

    public static void add() {
        System.out.print("Nhập ID: ");
        int id = myKeyBoard.nextInt();
        myKeyBoard.nextLine();
        
        System.out.print("Nhập giá: ");
        double price = myKeyBoard.nextDouble();
        myKeyBoard.nextLine();
        
        System.out.print("Nhập năm sản xuất: ");
        int yearOfProduct = myKeyBoard.nextInt();
        myKeyBoard.nextLine();
        
        if (yearOfProduct < 2018) {
            System.err.println("Năm sản xuất phải lớn hơn hoặc bằng 2018!");
            return;
        }
        
        System.out.print("Nhập màu sắc: ");
        String color = myKeyBoard.nextLine();
        
        System.out.print("Nhập thương hiệu: ");
        String brand = myKeyBoard.nextLine();
        
        Laptop newLaptop = new Laptop(id, price, yearOfProduct, color, brand);
        Node newNode = new Node(newLaptop);
        newNode.setNext(head);
        head = newNode;

        System.err.println("Thêm Laptop thành công.");
    }

    public static void reduce() {
        Node current = head;
        int count = 0;
        
        while (current != null) {
            if (current.getData().getBrand().equalsIgnoreCase("Acer")) {
                double newPrice = current.getData().getPrice() * 0.5;
                current.getData().setPrice(newPrice);
                count++;
            }
            current = current.getNext();
        }

        if (count == 0) {
            System.err.println("Không tìm thấy laptop của hãng Acer trong danh sách.");
        } else {
            System.err.println("Giảm giá thành công cho " + count + " laptop của hãng Acer.");
        }
    }

    public static void print() {
        System.err.println("Danh sách Laptop có màu gray");
        Node current = head;
        boolean found = false;
        
        while (current != null) {
            if (current.getData().getColor().equalsIgnoreCase("Gray")) {
                System.out.println(current.getData());
                found = true;
            }
            current = current.getNext();
        }
        
        if (found = false) 
            System.err.println("Không tìm thấy Laptop có màu Gray trong danh sách.");
    }

    public static void delete() {
        System.err.println("=== Xóa các Laptop ở đầu danh sách ===");
        System.err.print("Nhập số lượng Laptop cần xóa: ");
        int count = myKeyBoard.nextInt();
        myKeyBoard.nextLine();

        if (count >= getTotalLaptops()) {
            System.err.println("Số lượng Laptop cần xóa vượt quá tổng số Laptop trong danh sách.");
            head = null;
            System.err.println("Danh sách Laptop đã được xóa hết.");
        } else {
            for (int i = 0; i < count; i++) {
                head = head.getNext();
            }
            System.err.println("Xóa " + count + " Laptop đầu danh sách thành công.");
        }
    }

    public static int getTotalLaptops() {
        int count = 0;
        Node current = head;
        
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
