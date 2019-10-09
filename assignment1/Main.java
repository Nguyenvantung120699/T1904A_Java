package assignment1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n;
        System.out.println("nhap vao so n : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(checkSNT(i)){
                System.out.println(i+"la so nguyen to");
            }
        }
    }

    public static boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}