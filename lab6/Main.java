package lab6;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        News n1 = new News();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ID : ");

        //kiem tra xem du lieu nhap vao
        /*if(sc.hasNextInt()){
            id = sc.nextInt();
        }else{
            id = 0;
        }*/
        //id=dieu kien? gia tri1 : gia tri 2 ;
        int id = sc.hasNextInt()?sc.nextInt():0;
        n1.setId(id);
        sc.nextLine();
        System.out.println("nhap title : ");
        n1.setTitle(sc.nextLine());
        System.out.println("nhap publishDate : ");
        n1.setPublishDate(sc.nextLine());
        System.out.println("nhap author : ");
        n1.setAuthor(sc.nextLine());
        System.out.println("nhap content : ");
        n1.setContent(sc.nextLine());

        System.out.println("nhap 3 so rateList : ");
        for(int i=0;i<3;i++){
            n1.rateList[i] = sc.hasNextInt()?sc.nextInt():0;
        }

        n1.Display();
        n1.Calculate();
        n1.Display();
    }
}