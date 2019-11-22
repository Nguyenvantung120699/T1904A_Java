package jv2_session9;

import java.util.ResourceBundle;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Locale vn = new Locale("vi","VN");
        Locale.setDefault(vn);
        ResourceBundle bundle = ResourceBundle.getBundle("jv2_session9.Message");
        System.out.println(bundle.getString("hello"));
    }
}