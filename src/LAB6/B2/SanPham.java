package LAB6.B2;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    String hang;
    void xuat(){
        System.out.println(String.format("Tên sản phẩm : %s | Đơn giá : %s | Hãng : %s",tenSp,donGia,hang));
    }
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        tenSp = scanner.next();
        System.out.print("Nhập đơn giá : ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập hãng : ");
        hang = scanner.next();
    }
}
