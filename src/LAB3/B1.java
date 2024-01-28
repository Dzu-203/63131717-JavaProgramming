package LAB3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố : ");
        int soNT = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < soNT; i++){
             if (soNT % i == 0){
                 check = false;
                 break;
            }
        }
        if(check == true){
            System.out.println(String.format("%s là số nguyên tố",soNT));
        }else{
            System.out.println(String.format("%s không là số nguyên tố",soNT));

        }

    }
}
