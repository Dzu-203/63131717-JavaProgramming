package LAB7.B1;

public class Vuong extends ChuNhat{
    public Vuong(double canh){
        super(canh,canh);
    }
    @Override
    void xuat() {
        System.out.println(String.format("Cạnh : %s | Chu vi : %s | Diện tích : %s",dai,getChuVi(),getDienTich()));
    }
}
