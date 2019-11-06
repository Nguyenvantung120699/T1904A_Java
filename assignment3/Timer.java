package assignment3;

import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Timer{
    public TextField ipmin = new TextField();
    public Text opmin = new Text();
    public Text opsec = new Text();

    
    public static int s_min;

    public void startTime(){
        try{
            s_min = Integer.parseInt(ipmin.getText());
        }catch(Exception e){
            s_min = 10;
        }

        Runnable r = new Runnable(){
        
            @Override
            public void run() {
                for(Integer i = Timer.s_min-1;i>=0;i--){
                    for(Integer j=59;j>=0;j--){
                        opmin.setText(String.format("%02d", i));
                        opsec.setText(String.format("%02d", j));
                        try{
                            Thread.sleep(1000);
                        }catch(Exception e){

                        }
                    }
                }
                Platform.exit();
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}