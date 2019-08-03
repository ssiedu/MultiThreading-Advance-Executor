
import static java.lang.System.out;

public class ThreadGroupTwo {
    public static void main(String[] args) throws Exception {
        
        ThreadGroup group=Thread.currentThread().getThreadGroup();
        ThreadGroup mygroup=new ThreadGroup(group,"testgrp");
        Thread t1=new Thread(mygroup,new Runnable(){public void run(){while(true){out.println("One  : ");}}});
        Thread t2=new Thread(mygroup,new Runnable(){public void run(){while(true){out.println("Two  : ");}}});
        //t1.start();
        //t2.start();
        
        out.println("Active Count : "+mygroup.activeCount());
        out.println("Group Name   : "+mygroup.getName());
        out.println("Group Parent : "+mygroup.getParent().getName());
        Thread th[]=new Thread[mygroup.activeCount()];
        mygroup.enumerate(th);
        for(Thread t:th){
            out.println(t.getName());
        }
        out.println("____________________________________________________");
        group.list();
        Thread.sleep(50000);
        mygroup.interrupt();
    }
}
