/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String dia_chi;
    private double Tien_luong;
    private int Tong_so_gio_lam;
    
    //constructor khong tham so
    public NhanVien(){
       
    }
    public NhanVien(String ten, int tuoi,String diachi,double tienluong,int tongsogiolam){
        this.Ten = ten;
        this.Tuoi = tuoi;
        this.dia_chi = diachi;
        this.Tien_luong = tienluong;
        this.Tong_so_gio_lam = tongsogiolam;
     }
    //
    
        public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public double getTien_luong() {
        return Tien_luong;
    }

    public void setTien_luong(double Tien_luong) {
        this.Tien_luong = Tien_luong;
    }

    public int getTong_so_gio_lam() {
        return Tong_so_gio_lam;
    }

    public void setTong_so_gio_lam(int Tong_so_gio_lam) {
        this.Tong_so_gio_lam = Tong_so_gio_lam;
    }
 
}
