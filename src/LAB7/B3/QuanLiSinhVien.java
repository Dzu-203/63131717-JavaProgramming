package LAB7.B3;

import LAB5.B3.SanPham;

import java.util.*;

public class QuanLiSinhVien extends SinhVien {
    static Scanner scanner = new Scanner(System.in);
    static List<SinhVien> danhSach = new ArrayList<SinhVien>();
    static void menu() {
        while (true){
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nhập danh sách sinh viên.");
            System.out.println("2. Xuất danh sách sinh viên.");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi.");
            System.out.println("4. Sắp xếp danh sách theo điểm.");
            System.out.println("5. Kết thúc.");
            System.out.print("Vui lòng chọn : ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    SVGioi();
                    break;
                case 4:
                    sapxep();
                    xuat();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
    static void nhap(){
        while (true){
            System.out.print("Nhập tên sinh viên : ");
            String ten = scanner.next();
            System.out.print("Nhập điểm : ");
            Double diem = scanner.nextDouble();
            danhSach.add(new SinhVien(ten,diem));
            System.out.print("Nhập tiếp không (Y/N) : ");
            if (scanner.next().toUpperCase().equals("N")){
                break;
            }
        }
    }
    static void xuat(){
        if (danhSach.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            System.out.println("Danh sách : ");
            for (int i = 0; i < danhSach.size(); i++){
                System.out.println(String.format("%s : %s",danhSach.get(i).hoTen,danhSach.get(i).diem));
            }
        }
    }

    static void sapxep() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return Double.compare(o2.diem, o1.diem);
                }
            };
            Collections.sort(danhSach,comparator);
        }
    }

    static void SVGioi(){
        for (SinhVien sv : danhSach){
            if (sv.checkHocLuc(sv.diem).equals("Giỏi")){
                System.out.println(String.format("%s : %s", sv.hoTen,sv.diem));
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
