import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskThree implements Runnable {
    private long sleepTime;
    
    public TaskThree(long sleepTime){
        this.sleepTime=sleepTime;
    }
    public void run(){
      String name=Thread.currentThread().getName();
      String daemonStatus=Thread.currentThread().isDaemon()?"Daemon":"NonDaemon";
      for(int i=1; i<=10;i++){
          out.println("Thread "+name+" "+daemonStatus+" => "+i);
          try {
              Thread.sleep(sleepTime);
          } catch (InterruptedException ex) {
              Logger.getLogger(TaskOne.class.getName()).log(Level.SEVERE, null, ex);
          }
          //out.println("Thread "+name+" "+daemonStatus+" => "+i);
      }
    }
}