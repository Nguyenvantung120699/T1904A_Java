package bt5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

class PhoneBook extends Phone {

    ArrayList<Contacts> PhoneList;

    PhoneBook() {
        this.PhoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
       for(Contacts c1 : PhoneList){
           if(c1.getName().equals(name)){
               if(!c1.getPhone().equals(phone)){
                   c1.setPhone(c1.getPhone()+":"+phone);
                   return;
               }
               return;
           }
       }
       Contacts c2 = new Contacts(name,phone);
       PhoneList.add(c2);

    }

    @Override
    public void removePhone(String name) {
        for(Contacts c1 : PhoneList){
         if(c1.getName().equals(name)){
             PhoneList.remove(c1);
             return;
         }
       }

    }

    @Override
    public void searchPhone(String name) {
          for(Contacts c1 : PhoneList){
           if(c1.getName().equals(name)){
             System.out.println(c1.getPhone());
             return;
           }
       }

    }

    @Override
    public void sort() {
       Collection.sort(PhoneList,new Comparator<Contacts>() {
            @Override 
            public int Comparator(Contacts o1,Contacts o2){
                return o1.getName().compareTo(o2.getName());
            }
       });
       for(Contacts c1 : PhoneList){
           System.out.println(c1.getName()+"-"+c1.getPhone());
       }

    }

    @Override
    public void updatePhone(String name, String newphone) {
           for(Contacts c1 : PhoneList){
           if(c1.getName().equals(name)){
              c1.setPhone(newphone);
           }
       }


    }

   

}