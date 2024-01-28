package LAB4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //baitap1
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
        //baitap2
        SanPham sp3 = new SanPham("Sữa",11000,1000);
        SanPham sp4 = new SanPham("Nước",10000);
        sp3.xuat();
        sp4.xuat();
    }
}
