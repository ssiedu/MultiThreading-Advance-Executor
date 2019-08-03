
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VolatileDemo {
    static boolean flag=true;
    static int result=0;
    public static void main(String args[]){
        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=1; i<=50;i++){
                    result=i;
                    if(i==10){
                        flag=false;
                    }
                    out.println("Produced "+i);
                }
            }
        });
        t1.start();
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                while(flag){
                    out.println(result);
                }
            }
        });
        t2.start();
        
    }
}
