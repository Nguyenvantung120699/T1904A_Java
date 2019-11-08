package jv2_lab4;

public class Action{

    // public static int snt = 2;
    // public static int sntbp = 0;

    public int snt=2;
    public int prev_snt;

    public synchronized void songuyentotieptheo(){
        for(int i=snt+1;true;i++){
            if(checkSNT(i)){
                snt = i;
                notify();
                System.out.println("Next: "+snt);
                return;
            }
        }
    }
    private boolean checkSNT(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public synchronized void binhphuongsnt(){
        if(prev_snt == snt){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("Binh phuong : "+snt*snt);
        prev_snt = snt;
    }

    // public void songuyento(){

    //     for(int i=snt;i<10;i++){
    //         int dem = 0;
    //         for(int j = 2;j<=i;j++)
    //         {
    //             if(i%j==0)
    //             {
    //                dem+=1;
    //             }
    //         }
    //         if(dem<=1)
    //         {
    //             snt=i;
    //             System.out.println(snt);
    //         }
    //         try{
    //             Thread.sleep(1000);
    //         }catch(Exception e){

    //         }
    //     }
    // }

    // public void binhphuongsnt(){
    //         for(int i = 0;i<10;i++){
    //              sntbp=snt*snt;
    //             System.out.println(sntbp);
    //             try{
    //                 Thread.sleep(1000);
    //             }catch(Exception e){
    
    //             }
    //         }
    // }
}