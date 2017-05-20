package Creating_Thread;

public class Simple_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    }
// Here because try and catch block is not used so you have to create another class to run Simple Thread.
}