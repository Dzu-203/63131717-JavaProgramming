package LAB6.B3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
    String hoTen;
    String Email;
    String SoDienThoai;
    String CMND;

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("\"^[\\\\w\\\\.-]+@[a-zA-Z\\\\d]+\\\\.[a-zA-Z]{2,}$\"");
        if (pattern.matcher(email).find()){
            this.Email = email;
        }else {
            System.out.println("Email không hợp lệ");
            setSoDienThoai(NhapLai("Email"));
        }
    }
    public void setSoDienThoai(String soDienThoai) {
        Pattern pattern = Pattern.compile("^[\\d]{10}+$");
        if (pattern.matcher(soDienThoai).find()){
            this.SoDienThoai = soDienThoai;
        }else {
            System.out.println("Số điện thoại không hợp lệ");
            setSoDienThoai(NhapLai("Số điện thoại"));
        }
    }

    public void setCMND(String CMND) {
        Pattern pattern = Pattern.compile("^[\\d]{9}+$");
        if (pattern.matcher(CMND).find()){
            this.CMND = CMND;
        }else {
            System.out.println("CMND không hợp lệ");
            setSoDienThoai(NhapLai("Số CMND"));
        }
    }


    public String NhapLai(String thongTin){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập lại : %s",thongTin);
        String duLieu = scanner.nextLine();
        return duLieu;
    }
    void xuat(){
        System.out.println(String.format("Họ tên : %s | Email : %s | Số điện thoại : %s | CMND : %s",hoTen,Email,SoDienThoai,CMND));
    }

    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên : ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập Email : ");
        setEmail(scanner.nextLine());
        System.out.print("Nhập số điện thoại : ");
        setSoDienThoai(scanner.nextLine());
        System.out.print("Nhập CMND : ");
        setCMND(scanner.nextLine());

    }
}
