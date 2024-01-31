package LAB7.B1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin hình chủ nhật 1 :");
        System.out.print("Chiều dài : ");
        double dai1 = scanner.nextDouble();
        System.out.print("Chiều rộng : ");
        double rong1 = scanner.nextDouble();
        ChuNhat cn1 = new ChuNhat(dai1,rong1);
        System.out.println("Nhập thông tin hình chủ nhật 2 :");
        System.out.print("Chiều dài : ");
        double dai2 = scanner.nextDouble();
        System.out.print("Chiều rộng : ");
        double rong2 = scanner.nextDouble();
        ChuNhat cn2 = new ChuNhat(dai2,rong2);
        System.out.println("Nhập thông tin hình vuông :");
        System.out.print("Cạnh : ");
        double canh = scanner.nextDouble();
        Vuong vuong = new Vuong(canh);
        cn1.xuat();
        cn2.xuat();
        vuong.xuat();

    }
}
