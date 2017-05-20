package Creating_Thread;

public class Join_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println(" " + Thread.currentThread().getName());
        // to get the name of current thread the above line of code is used
        }
        // Here try catch block is not used to understand the concept of join () and it helped.       
        /*
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.getMessage();
        }
         */
    }// end of run

    public static void main(String args[]) {
        Join_Thread obj1 = new Join_Thread();
        Join_Thread obj2 = new Join_Thread();
        Join_Thread obj3 = new Join_Thread();
        // setName() is used to set the name of a thread. Comes in handy when more than two threads are used in a class
        // Here first we set the name of thread and then run it. Makes Sense!!!
        obj1.setName("Ivy Fernandes");
        obj1.start();
        try {
            obj1.join();
            // join() do not allow its thread to terminate unless its task is complete & then allows other threads to start
        } catch (Exception e) {
            e.getMessage();
        }
        obj2.setName("Raaj Kanchan");
        obj2.start();
        obj3.setName("Love");
        obj3.start();
    }// end of main
}
