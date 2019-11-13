package jv2_lab6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
            primaryStage.setTitle("Contact");
            primaryStage.setScene(new Scene(root, 365, 400));
            primaryStage.show();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}