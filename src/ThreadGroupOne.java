
import static java.lang.System.out;
import java.util.ArrayList;


public class ThreadGroupOne {

    public static void main(String[] args) {
        ThreadGroup group=Thread.currentThread().getThreadGroup();
        out.println("Active Count : "+group.activeCount());
        out.println("Group Name   : "+group.getName());
        out.println("Group Parent : "+group.getParent().getName());
        ThreadGroup sysgroup=group.getParent();//fetching the parent group of main (system)
        Thread th[]=new Thread[sysgroup.activeCount()];
        sysgroup.enumerate(th);
        for(Thread t:th){
            out.println(t.getName());
        }
        out.println("____________________________________________________");
        group.list();
        sysgroup.list();
        
    }
}
