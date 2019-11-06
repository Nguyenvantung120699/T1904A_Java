package lab_jv2_2;

public class Action implements Runnable {

    @Override
    public void run() {
        int min = 9;
        int sec = 60;
        for(int j=min;min>0;j--){
            if(sec > 0){
                for(int i=sec;i>0;i--){
                    sec--;
                    try{
                        System.out.println(min+":"+sec);
                        Thread.sleep(100);
                    }catch(Exception e){
                        
                    }
                }

            }else{
                sec = 59;
                min--;
            }
        }
    }
}