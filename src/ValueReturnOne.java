
public class ValueReturnOne {
    public static void main(String[] args) throws Exception {

        ValueReturningTask task1=new ValueReturningTask(10, 20, 2000);
        ValueReturningTask task2=new ValueReturningTask(30, 40, 2000);
        ValueReturningTask task3=new ValueReturningTask(50, 60, 2000);
        Thread t1=new Thread(task1,"First");
        Thread t2=new Thread(task2,"Second");
        Thread t3=new Thread(task3,"Third");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        System.out.println("Result Frst : "+task1.getSum());
        t2.join();
        System.out.println("Result Scnd : "+task2.getSum());
        t3.join();
        System.out.println("Result Thrd : "+task3.getSum());
        
    }
}
