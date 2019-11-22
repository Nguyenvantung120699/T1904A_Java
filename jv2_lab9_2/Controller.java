package jv2_lab9_2;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller{
    public Text title = new Text();
    public RadioButton rbEN = new RadioButton();
    public RadioButton rbVN = new RadioButton();
    public RadioButton rbJP = new RadioButton();
    public TextField txtName = new TextField();
    public TextField txtEmail = new TextField();
    public TextField txtPass = new TextField();
    public TextField txtConPass = new TextField();
    public Button btSm = new Button();

    public void changeLanguage(){
        final ResourceBundle bundle = ResourceBundle.getBundle("jv2_lab9_2.Message");
        Main.boxStage.setTitle("sign_in");
        title.setText(bundle.getString("sign_in"));
        rbEN.setText(bundle.getString("en"));
        rbVN.setText(bundle.getString("vn"));
        rbJP.setText(bundle.getString("jp"));
        txtName.setPromptText(bundle.getString("username"));
        txtEmail.setPromptText(bundle.getString("email"));
        txtPass.setPromptText(bundle.getString("pass"));
        txtConPass.setPromptText(bundle.getString("conpass"));
        btSm.setText(bundle.getString("submit"));
    }
    
    public void unselectedButton(){
        rbEN.setSelected(false);
        rbVN.setSelected(false);
        rbJP.setSelected(false);
    }
    public void langEN(){

        Locale.setDefault(Locale.US);
        this.unselectedButton();
        rbEN.setSelected(true);
        this.changeLanguage();
    }

    public void langVN(){
        Locale.setDefault(new Locale("vi","VN"));
        this.unselectedButton();
        rbVN.setSelected(true);
        this.changeLanguage();
    }

    public void langJP(){
        Locale.setDefault(new Locale("jp","JP"));
        this.unselectedButton();
        rbJP.setSelected(true);
        this.changeLanguage();
    }


}