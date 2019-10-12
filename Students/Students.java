/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;


import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Students {
    private String MaSV;
    private double Diem;
    private int Tuoi;
    private String Lop;
    
    //constructor khong tham so
    public Students(){
        
    }
    //constructor day du tham so 
    public Students(String Masv, double diem, int tuoi, String lop){
        
    }

    public String getMaSV() {
        return MaSV;
    }
    
    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }


    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }


    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    
    //nhap thong tin
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma so :");
        setMaSV(sc.nextLine());
        while(MaSV.length() != 8){
            System.out.println("nhap lai :");
            setMaSV(sc.nextLine());
        }
        System.out.println("nhap diem : ");
        setDiem(sc.nextDouble());
        while(getDiem()<0 || getDiem()>10){
            System.out.println("nhap lai diem:");
            setDiem(sc.nextInt());
        }
        System.out.println("nhap tuoi : ");
        setTuoi(sc.nextInt());
          while(Tuoi < 18){
            System.out.println("nhap lai tuoi :");
            setMaSV(sc.nextLine());
        }
          sc.nextLine();
         
        System.out.println("nhap lop : ");
        setLop(sc.nextLine());
      
        while(Lop.matches("A(.*)")==false && Lop.matches("C(.*)")==false){
            System.out.println("nhap lai lop : ");
            setLop(sc.nextLine());
        }
       
            
        
    }
    
    public void showInfor(){
        System.out.println("===========================");
        System.out.println("Ma so : " + " " + getMaSV());
        System.out.println("Diem : " + " " + getDiem());
        System.out.println("Tuoi : " + " " + getTuoi());
        System.out.println("Lop : " + " " + getLop());
    }
    
    
    public void xethocbong(){
        if(Diem > 8){
            System.out.println("du diem nhan hoc bong");
        }else{
            System.out.println("Khong du dieu kien nhan hoc bong");
        }
    }
}
