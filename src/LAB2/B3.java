package LAB2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();

        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Số tiền điện cần thanh toán là: " + tien + " đồng");
    }
}
