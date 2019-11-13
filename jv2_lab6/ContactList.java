package jv2_lab6;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

public class ContactList implements Initializable {
    public ListView<Contact> listView = new ListView<>();
    public static Contact detail;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/TungT1904A";
           String username = "root";
           String password = "";
           Connection conn = DriverManager.getConnection(url, username, password);
           Statement stm = conn.createStatement();
           String sql = "SELECT * FROM user";
           ResultSet rs = stm.executeQuery(sql);

           ObservableList<Contact> list = FXCollections.observableArrayList();

           while(rs.next()){
               Integer id = rs.getInt("user_id");
               String user_name = rs.getString("user_name");
               String company_name = rs.getString("company_name");
               String address = rs.getString("address");
               Contact c = new Contact(id,user_name,company_name,address);

               list.add(c);

           }
           listView.setItems(list);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }

    }
    public void viewContact(){
        detail = listView.getSelectionModel().getSelectedItem();
        try{
            Parent view = FXMLLoader.load(getClass().getResource("deltai.fxml"));
            Main.mainStage.getScene().setRoot(view);;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}