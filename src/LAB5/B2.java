package LAB5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2 {
    static Scanner scanner = new Scanner(System.in);
    static List<String> lists = new ArrayList<String>();

    static void menu() {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1.Nhập danh sách.");
            System.out.println("2.Xuất danh sách vừa nhập.");
            System.out.println("3.Xuất danh sách ngẫu nhiên.");
            System.out.println("4.Sắp xếp danh sách giảm dần và xuất danh sách.");
            System.out.println("5.Nhập tên cần xóa.");
            System.out.println("6.Kết thúc.");
            System.out.print("+ Vui lòng nhập lựa chọn : ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    nhap();
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    xuat();
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    ngaunhien();
                    System.out.println("---------------------------------");
                    xuat();
                    break;
                case 4:
                    sapxep();
                    xuat();
                    System.out.println("---------------------------------");
                    break;
                case 5:
                    xoa();
                    System.out.println("---------------------------------");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.out.println("---------------------------------");
                    break;
            }
        }
    }

    static void nhap() {
        while (true) {
            System.out.print("Nhập tên cần thêm : ");
            String x = scanner.next();
            lists.add(x);
            System.out.print("Nhập tiếp không (Y/N) : ");
            if (scanner.next().equals("N")) {
                break;
            }
        }

    }

    static void xuat() {
        if (lists.isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách : ");
            for (int i = 0; i < lists.size(); i++) {
                System.out.println(String.format("%s. %s", i + 1, lists.get(i)));
            }
        }


    }

    static void sapxep() {
        Collections.sort(lists, Collections.reverseOrder());
    }

    static void ngaunhien() {
        Collections.shuffle(lists);
    }

    static void xoa() {
        System.out.print("Nhập tên cần xóa : ");
        String hoTenCanXoa = scanner.next();
        if (lists.contains(hoTenCanXoa)) {
            lists.remove(hoTenCanXoa);
            System.out.println("Đã xóa khỏi danh sách");
        } else {
            System.out.println("Không tìm thấy tên đã xóa");
        }

    }

    public static void main(String[] args) {
        menu();
    }
}
