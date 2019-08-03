
public class TerminateOne {

    public static void main(String[] args) throws Exception {

        TaskFour task1=new TaskFour();
        TaskFour task2=new TaskFour();
        TaskFour task3=new TaskFour();
        
        Thread t1=new Thread(task1,"First");
        Thread t2=new Thread(task2,"Second");
        Thread t3=new Thread(task3,"Third");
        t1.start();
        t2.start();
        t3.start();
        task1.cancel();
        task2.cancel();
        task3.cancel();
        
        
    }
}
