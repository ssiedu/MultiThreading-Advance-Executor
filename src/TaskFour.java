import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskFour implements Runnable {
    
    private boolean shutdown;
    
    
    public void run(){
      String name=Thread.currentThread().getName();
      for(int i=1;;i++){
          out.println("Thread "+name+" "+" => "+i);
          try {
              Thread.sleep(3000);
          } catch (InterruptedException ex) {
              Logger.getLogger(TaskOne.class.getName()).log(Level.SEVERE, null, ex);
          }
          if(shutdown){
              break;
          }
      }
    }
    public void cancel(){
        String name=Thread.currentThread().getName();
        //System.out.println("Shutting Down  : "+name);
        shutdown=true;
    }
}