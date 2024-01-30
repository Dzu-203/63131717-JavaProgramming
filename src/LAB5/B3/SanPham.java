package LAB5.B3;

public class SanPham {
    String ten;
    double gia;
    public SanPham(){}

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }
}
