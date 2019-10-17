package lab5;

public class Student extends Person{
    public void checkTuoi(){
        String[] arr1 = this.getNgaySinh().split("-");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        int year = Integer.parseInt(arr1[0]);
        if(2019 - year < 18){
            System.out.println("chua du 18 tuoi");
        }
        else{
            System.out.println("du 18 tuoi");
        }
    }
}