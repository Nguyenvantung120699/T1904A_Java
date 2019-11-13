package jv2_lab6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ContactDeltai implements Initializable {

    public Text txt = new Text();
    public ListView<PhoneNumber> listView = new ListView<>();

    private String sql_txt = "SELECT * FROM phone_number WHERE phone_id = ?";

    public static ObservableList<PhoneNumber> list = FXCollections.observableArrayList();
    public static Integer detail_id = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txt.setText(ContactList.detail.getUser_name());
        if(detail_id != ContactList.detail.getId()){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/TungT1904A";
                String username = "root";
                String password = "";
                Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement prstm = conn.prepareStatement(sql_txt);
                prstm.setInt(1,ContactList.detail.getId());

                ResultSet rs = prstm.executeQuery();
                list.clear();
                while (rs.next()){
                    Integer phoneid = rs.getInt("phone_id");
                    String phonenumber = rs.getString("phone_number");
                    String typephone = rs.getString("type_number");
                    PhoneNumber p = new PhoneNumber(phoneid,phonenumber,typephone);
                    list.add(p);
                }
                detail_id = ContactList.detail.getId();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        listView.setItems(list);

    }

    public void back(){
        try {
            Parent view = FXMLLoader.load(getClass().getResource("contact.fxml"));
            Main.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}