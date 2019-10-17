package lab5;
import java.util.Scanner;


public class Person{
    public String Ten;
    public String GioiTinh;
    public String NgaySinh;
    public String DiaChi;

    public Person(){

    }

    public Person(String ten, String gioitinh , String ngaysinh , String diachi){

    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void inputInfo(){
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap ten : ");
        setTen(sc.nextLine());
        System.out.println("gioi tinh : ");
        setGioiTinh(sc.nextLine());
        System.out.println("ngay sinh : ");
        setNgaySinh(sc.nextLine());
        System.out.println("dia chi : ");
        setDiaChi(sc.nextLine());
    }

    public void showinfo(){
        System.out.println("ten : "+ " " + this.getTen());
        System.out.println("ten : "+ " " + this.getGioiTinh());
        System.out.println("ten : "+ " " + this.getNgaySinh());
        System.out.println("ten : "+ " " + this.getDiaChi());
    }

}