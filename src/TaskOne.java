
import static java.lang.System.out;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TaskOne implements Runnable {
    public void run(){
      String name=Thread.currentThread().getName();
      for(int i=1; i<=5;i++){
          out.println("Thread "+name+" => "+(i*2));
          try {
              Thread.sleep(100);
          } catch (InterruptedException ex) {
              Logger.getLogger(TaskOne.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
}