package Assiment4;

public class Main{

  public static void main(String[] args){
      Product p1 = new Product();
      p1.inputProduct();
      p1.checkQty();

      Cart c1 = new Cart();
      c1.inputCustomer();
      c1.addProduct(p1);
      c1.Totalmoney();

  }
}