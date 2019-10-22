package bt5;
import java.util.Scanner;

public class Contacts{
   public String name;
   public String phone;

    public Contacts(){

    }

     public Contacts(String name1, String phone1) {
        this.name = name1;
        this.phone = phone1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone1) {
        this.phone = phone1;
    }

   public void inputContacts(){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter name:");
       setName(sc.nextLine());
       System.out.println("enter phone:");
       setPhone(sc.nextLine());
   }

}