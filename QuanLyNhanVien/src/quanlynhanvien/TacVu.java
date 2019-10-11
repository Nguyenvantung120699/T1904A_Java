/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TacVu {
    Scanner  sc = new Scanner(System.in);
    static NhanVien NV = new NhanVien();
    public void inputInfo(){
        
        System.out.println("Enter Your Name. ");
        NV.setTen(sc.nextLine());
        System.out.println("Enter Your Age. ");
        NV.setTuoi(sc.nextInt());
        System.out.println("Enter Your Address. ");
        NV.setDia_chi(sc.nextLine());
        System.out.println("Enter Your Salary. ");
        NV.setTien_luong(sc.nextDouble());
        System.out.println("Enter Your Toltal Time. ");
        NV.setTong_so_gio_lam(sc.nextInt());
    }
    
    public void outputInfor(){
        System.out.println("======================================");
        System.out.println("Name :" + NV.getTen());
        System.out.println("Dia Chi :" + NV.getDia_chi());
        System.out.println("Tuoi :" + NV.getTuoi());
        System.out.println("So Gio Lam :" + NV.getTong_so_gio_lam());
        System.out.println("Tien Luong :" + NV.getTien_luong());
    }
    private double Thuong;
    public void TinhThuong(){
        if(NV.getTong_so_gio_lam()>200){
            Thuong = (NV.getTien_luong()*20)/100;
        }
        if(NV.getTong_so_gio_lam()<200 && NV.getTong_so_gio_lam()>=100){
            Thuong = (NV.getTien_luong()*10)/100;
        }
        if(NV.getTong_so_gio_lam()<100){
            Thuong = 0;
        }
        System.out.println("tien thuong la : " + Thuong);
    }
}
