package LAB4;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;

    public SanPham() {

    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp,donGia,0);
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau(){
        return donGia * 0.1;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        tenSp = scanner.next();
        System.out.print("Nhập đơn giá : ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá : ");
        giamGia = scanner.nextDouble();
    }
    public void xuat(){
        System.out.println(String.format("Tên sản phẩm : %s | Đơn giá : %s | Giảm giá : %s | Thuế nhập khẩu : %s",tenSp,donGia,giamGia,getThueNhapKhau()));
    }
}
