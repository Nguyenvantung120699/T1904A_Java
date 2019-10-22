package bt5;

public class Main{
    public static void main(String[] args) {
        Phone Pn1 = new PhoneBook();
        Pn1.insertPhone("tung", "0123456778");
        Pn1.removePhone("tung");
        Pn1.updatePhone("tung", "02345679");
        Pn1.searchPhone("tung");
    }
}