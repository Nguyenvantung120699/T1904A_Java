package exam;

import java.util.Scanner;

public class Hotel{
    public String name;
    public String ownerName;
    public String location;


    //contructor
    public Hotel() {
    }

    public Hotel(String name, String ownerName, String location) {
        this.name = name;
        this.ownerName = ownerName;
        this.location = location;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void addHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name hotel :");
        setName(sc.nextLine());
        System.out.println("enter ownerName :");
        setOwnerName(sc.nextLine());
        System.out.println("enter location :");
        setLocation(sc.nextLine());
    }

     
}