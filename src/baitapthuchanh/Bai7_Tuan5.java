
package baitapthuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai7_Tuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ArrayList<Student> dsSV = ds.getDs();
        System.out.println("Menu");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Xóa sinh viên");
        System.out.println("3. Tìm kiếm sinh viên dựa trên mã sinh viên");
        System.out.println("4. So sánh điểm trung bình của các sinh viên giảm dần");
        int luachon;
        do{
            System.out.println("Mời bạn lựa chọn:");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:{
                    sc.nextLine();
                    System.out.println("Thêm sinh viên");
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = sc.nextLine();
                    System.out.println("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhập điểm trung bình: ");
                    float dtb = sc.nextFloat();
                    Student st = new Student(maSV, ten, dtb);
                    dsSV.add(st);
                    break;
                }
                case 2:{
                    sc.nextLine();
                    System.out.println("Xóa sinh viên");
                    System.out.println("Nhập mã sinh viên muốn xóa: ");
                    String maSV = sc.nextLine();
                    ds.deleteStudent(maSV);
                    break;
}
                case 3:{
                    sc.nextLine();
                    System.out.println("Tìm kiếm sinh viên dựa trên mã sinh viên");
                    System.out.println("Nhập mã sinh viên cần tìm: ");
                    String maSV = sc.nextLine();
                    ds.timKiemTheoMaSv(maSV);
                    break;
                }
                case 4: {
                    System.out.println("So sánh điểm trung bình");
                    Collections.sort(dsSV);
                    ds.Xuat(dsSV);
                    break;
                }
                case 5: {
                    System.out.println("Danh sách sinh viên");
                    ds.Xuat(dsSV);
                    break;
                }
            }
        }while(luachon != 0);
    }
}