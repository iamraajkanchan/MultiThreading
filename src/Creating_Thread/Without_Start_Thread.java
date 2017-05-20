package Creating_Thread;

public class Without_Start_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String args[]) {
        Without_Start_Thread obj1 = new Without_Start_Thread();
        Without_Start_Thread obj2 = new Without_Start_Thread();

        obj1.run();
        obj2.run();
// Here obj1 and obj2 are treated as objects and not as threads. The program do gave you the outputs
// take my advice, do not run a thread without using its start method.
    }
}
