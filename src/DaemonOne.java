
//Daemon Thread using simple approach

import static java.lang.System.out;

public class DaemonOne {
    public static void main(String[] args) throws Exception {
        out.println("Starting App");
        Thread t1=new Thread(new TaskThree(200), "First");
        Thread t2=new Thread(new TaskThree(500), "Second");t2.setDaemon(true);
        t1.start();
        t2.start();
        //Thread.sleep(5000);
        //out.println("Stop App");
    }
}
