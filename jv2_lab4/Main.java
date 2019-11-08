package jv2_lab4;

public class Main{
    public static void main(String[] args) {
        Action a1 = new Action();
        //viết tắt = đoạn bên dưới
        new Thread(()->{
            for(int i = 0; i<100;i++){
                a1.songuyentotieptheo();
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
            }
        }).start();
        new Thread(()->{
            for(int i = 0; i<100;i++){
                a1.binhphuongsnt();
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
            }
        }).start();
        //Action a1 = new Action();
        // Runnable r1 = () ->{
        //     synchronized(a1){
        //         a1.songuyento();
        //         //a1.binhphuongsnt();
        //     }
        // };

        // Runnable r2 = () ->{
        //     synchronized(a1){
        //         a1.binhphuongsnt();
        //     }
        // };
        
        // Thread t1 = new Thread(r1);
        // t1.start();
        // Thread t2 = new Thread(r2);
        // t2.start();
    }
}