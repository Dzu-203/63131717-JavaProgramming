package LAB6.B3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        List<SinhVien> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSach.add(sv);
        }
        for(SinhVien sv : danhSach){
            sv.xuat();
        }
    }
}
