package LAB7.B2;

abstract public class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    abstract double getDiem();
    String getHocLuc(){
        String hocLuc;
        if (getDiem() >= 0 && getDiem() <= 10){
            if(getDiem() < 5){
                hocLuc = "Yếu";
            }else if (getDiem() >= 5 && getDiem() < 6.5){
                hocLuc = "Trung bình";
            }else if (getDiem() >= 6.5 && getDiem() < 7.5){
                hocLuc = "Khá";
            }else if (getDiem() >= 7.5 && getDiem() < 9){
                hocLuc = "Giỏi";
            }else {
                hocLuc = "Xuất sắc";
            }
        }else {
            hocLuc = "Không hợp lệ";
        }
        return hocLuc;
    }
    void xuat(){
        System.out.println(String.format("Họ tên : %s | Ngành : %s | Điểm : %s | Học lực : %s",hoTen,nganh,getDiem(),getHocLuc()));
    }
}
