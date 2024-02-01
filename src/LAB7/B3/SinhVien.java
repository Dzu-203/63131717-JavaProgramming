package LAB7.B3;

public class SinhVien {
    String hoTen;
    double diem;
    public SinhVien(){}
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public String checkHocLuc(double diem) {
        String hocLuc;
        if (diem < 5 && diem > 0) {
            hocLuc = "Yếu";
        } else if (diem >= 5 && diem < 6.5) {
            hocLuc = "Trung bình";
        } else if (diem >= 6.5 && diem < 7.5) {
            hocLuc = "Khá";
        } else if (diem >= 7.5 && diem < 9) {
            hocLuc = "Giỏi";

        } else if (diem >= 9 && diem <= 10) {
            hocLuc = "Xuất sắc";
        } else {
            hocLuc = "Nhập sai giá trị";
        }
        return hocLuc;
    }
}
