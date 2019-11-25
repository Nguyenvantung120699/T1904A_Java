package exam_adf2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ArrayList<Student> DS =new ArrayList<>();
        boolean p= true;
        Scanner sc =new Scanner(System.in);
        while (p){
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save");
            System.out.println("4. Exit");

            int opt = sc.hasNextInt()?sc.nextInt():5;

            switch (opt){
                case 1: DS.add(Main.Add());break;
                case 2 :Display(DS);break;
                case 3 :
                Main.Save(DS);break;
                case 4 : p=false;break;

            }

        }
    }

    public static Student Add() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id : ");
        String student_id = sc.nextLine();
        System.out.println("Nhap ten : ");
        String student_name= sc.nextLine();
        System.out.println("Nhap dia chi : ");
        String address=sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        String phone =sc.nextLine();
        return new Student(student_id,student_name,address,phone);
    }

    public static void Display(ArrayList<Student> studentList){
        for(Student s : studentList){
            System.out.println(s.getStudent_id()+"--"+ s.getStudent_name()+"--"+s.getAddress()+"--"+s.getPhone());
        }

    }

    public static void Save(ArrayList<Student> studentList){
        File f = new File("D:\\ClassT1904A\\java3\\src\\exam_adf2\\examStudent.txt");
        String ftxt = "";
        for(Student s : studentList){
        if (f.canWrite()){
    String v = s.getStudent_id()+"--"+ s.getStudent_name()+"--"+s.getAddress()+"--"+s.getPhone()+"\n";
            try {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeBytes(ftxt + v);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        }
    }
}