package Creating_Thread;

// Simple thread created with concurrency and without any extra class needed
public class Concurrent_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String args[]) {
        Concurrent_Thread obj1 = new Concurrent_Thread();
        Concurrent_Thread obj2 = new Concurrent_Thread();

        obj1.start();
        obj2.start();
    }
}
