package lab_jv2_2;


public class Main{
    public static void main(String[] args) {
        //Runnable r1 =()->{
        //      int count = 10;
        //      for(int i=count;i>0;i--){
        //          try{
        //             if(i<10){
        //                 System.out.println("00:0"+i);
        //                 if(i==1){
        //                     System.out.println("Chuc Mung");
        //                 }
        //             }
        //             else{
        //                 System.out.println("00:"+i);
        //             }
        //             Thread.sleep(1000);
        //          }catch(Exception e){

        //          }
        //      }
        // };
        // Thread t1 = new Thread(r1);
        // t1.start();

        Action a1 = new Action();
        Thread t2 = new Thread(a1);
        t2.start();
    }
}