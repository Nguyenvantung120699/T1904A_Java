package exam;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        ArraysHotel a1 = new ArraysHotel();

        boolean p = true;
        Scanner sc = new Scanner(System.in);
        while (p){
            System.out.println("1. Add Hotel");
            System.out.println("2. Show Hotel");
            System.out.println("0. Exit");
            int opt = sc.hasNextInt()?sc.nextInt():3;
            switch (opt){
                case 1:a1.newHotel();;break;
                case 2:a1.showHotel();;break;
                case 0: p=false;break;
            }
        }
    }
}