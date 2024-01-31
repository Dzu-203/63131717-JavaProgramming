package LAB7.B2;

public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT(String hoTen,double diemJava, double diemCss, double diemHtml) {
        super(hoTen,"IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem() {
        return (2*diemJava + diemHtml + diemCss) / 4;
    }
}
