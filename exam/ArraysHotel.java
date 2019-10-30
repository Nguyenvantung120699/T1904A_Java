package exam;

import java.util.ArrayList;


public class ArraysHotel {
   public ArrayList<Hotel> listHotel = new ArrayList<>();
   Hotel h1 = new Hotel();

   public void newHotel(){
       h1.addHotel();
       listHotel.add(h1);
   }

   public void showHotel(){
        System.out.println("name : "+h1.name);
        System.out.println("ownerName : "+h1.ownerName);
        System.out.println("location : "+h1.location);
}

}