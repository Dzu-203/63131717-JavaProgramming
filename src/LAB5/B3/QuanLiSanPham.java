package LAB5.B3;

import java.util.*;

public class QuanLiSanPham extends SanPham {
    static Scanner scanner = new Scanner(System.in);
    static List<SanPham> danhSachSanPham = new ArrayList<>();
    static void menu() {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nhập danh sách sản phẩm.");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình.");
            System.out.println("3. Tìm và xóa sản phẩm theo tên.");
            System.out.println("4. Xuất giá trung bình của các sản phẩm.");
            System.out.println("5. Kết thúc.");
            System.out.print("Vui lòng chọn: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    xuat();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xuatGiaTrungBinh();
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
            System.out.print("Nhập tên sản phẩm : ");
            String ten = scanner.next();
            System.out.print("Nhập giá sản phẩm : ");
            Double gia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(ten,gia));
            System.out.print("Nhập tiếp không (Y/N) : ");
            if (scanner.next().equals("N")){
                break;
            }
        }
    }
    static void xuat(){
        if (danhSachSanPham.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            System.out.println("Danh sách : ");
            for (int i = 0; i < danhSachSanPham.size(); i++){
                System.out.println(String.format("%s : %s",danhSachSanPham.get(i).ten,danhSachSanPham.get(i).gia));
            }
        }
    }

    static void sapxep() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Comparator<SanPham> comp = new Comparator<SanPham>() {
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    return Double.compare(o2.gia, o1.gia);
                }
            };
            Collections.sort(danhSachSanPham,comp);
        }
    }

    static void xoa(){
        System.out.print("Nhập tên cần xóa : ");
        String CanXoa = scanner.next();
        if (danhSachSanPham.contains(CanXoa)){
            danhSachSanPham.remove(CanXoa);
            System.out.println("Đã xóa khỏi danh sách");
        }else {
            System.out.println("Không tìm thấy tên đã xóa");
        }

    }

    static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            double tongGia = 0;
            for (SanPham sanPham : danhSachSanPham) {
                tongGia += sanPham.gia;
            }
            double giaTrungBinh = tongGia / danhSachSanPham.size();
            System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
