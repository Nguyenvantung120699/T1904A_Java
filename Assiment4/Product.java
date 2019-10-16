
package Assiment4;

import java.util.Scanner;

public class Product {
  public int Id;
  public String ProductName;
  public int Qty;
  public double Price;


//constructor null
  Product(){

  }
  Product(int id,String productname ,int Qty,double price){

  }

  
  //getter and setter
  public int getId(){
    return Id;
  }
  public void setId(int id){
    this.Id = id;
  }

  public String getProductName(){
    return ProductName;
  }
  public void setProductName(String productname){
    this.ProductName = productname;
  }

  public int getQty(){
    return Qty;
  }
  public void setQty(int qty){
    this.Qty = qty;
  }

  public double getPrice(){
    return Price;
  }
  public void setPrice(double price){
    this.Price = price;
  }


  //inputproduct
  public void inputProduct(){
    Scanner sc = new Scanner(System.in);
      Product p1 = new Product();
      System.out.println("id product: ");
      setId(sc.nextInt());
      sc.nextLine();
      System.out.println("Name product : ");
      setProductName(sc.nextLine());
      System.out.println("Qty : ");
      setQty(sc.nextInt());
      System.out.println("Price : ");
      setPrice(sc.nextDouble());
  }
  
  public void checkQty(){
    if(getQty()> 0){
        System.out.println( "Con hang");
     }else{
        System.out.println( "Het hang");
     }
  }

}

