package Assiment4;

import java.util.ArrayList;
import java.util.Scanner;


public class Cart{
  public int Id;
  public String Customer;
  public double GrandTotal = 0;
  public ArrayList<Product> productsList;
  public String City;

  //Array remember
  public Cart(){
    this.productsList = new ArrayList<>();
  }


   public int getId(){
     return Id;
   }
   public void setId(int Id){
     this.Id = Id;
   }

   public String getCustomer(){
     return Customer;
   }
   public void setCustomer(String Customer){
     this.Customer = Customer;
   } 

   public String getCity(){
     return City;
   }
   public void setCity(String City){
     this.City = City;
   }

   //input Customer
   public void inputCustomer(){
     Scanner sc = new Scanner(System.in);
      Cart c1 = new Cart();
      System.out.println("Id Customer : ");
      setId(sc.nextInt());
      sc.nextLine();
      System.out.println("Customer : ");
      setCustomer(sc.nextLine());
      System.out.println("City : ");
      setCity(sc.nextLine());

   }


  public void addProduct(Product p1){
     this.productsList.add(p1);
     System.out.println("add product complete !");
  }

   public void deleteProduct(Product p1){
     this.productsList.remove(p1);
     System.out.println("delete product complete !");
  }

  // Totalmoney
  Product p1 = new Product();
  public void Totalmoney(){
    for(Product p1: this.productsList){
      GrandTotal = p1.Price;
       if(City.matches("Ha Noi")==true && City.matches("HCM")==true){
            GrandTotal = GrandTotal*1.01;
            System.out.println("GrandTotal : "+ " " + this.GrandTotal);
        }
        else{
          GrandTotal = GrandTotal*1.02;
           System.out.println("GrandTotal : "+ " " + this.GrandTotal);
    }
    }
  }



}