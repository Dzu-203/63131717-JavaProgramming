package LAB7.B1;

public class ChuNhat {
    double rong;
    double dai;
    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    double getChuVi(){
        return (dai + rong) * 2;
    }
    double getDienTich(){
        return dai * rong;
    }
    void xuat(){
        System.out.println(String.format("Chiều dài : %s | Chiều rộng : %s | Chu vi : %s | Diện tích : %s",dai,rong,getChuVi(),getDienTich()));
    }

}
