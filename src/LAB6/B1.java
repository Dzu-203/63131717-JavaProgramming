package LAB6;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên : ");
        String hoTen = scanner.nextLine();
        String ho = hoTen.substring(0,hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" "),hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));
        System.out.println(String.format("Họ : %s | Tên Đệm : %s | Tên : %s",ho,tenDem,ten));
    }
}
