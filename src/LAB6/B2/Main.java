package LAB6.B2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        List<SanPham> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++){
            SanPham sanPham = new SanPham();
            sanPham.nhap();
            danhSach.add(sanPham);
        }
        for (SanPham sp : danhSach){
            if (sp.hang.equals("Nokia")){
                sp.xuat();
            }
        }
    }
}
