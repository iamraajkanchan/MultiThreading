package Advanced_Threading;

public class Daemon_Thread extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName() + " is a Daemon Thread");
        } else {
            System.out.println(Thread.currentThread().getName() + " is a Regular Thread");
        }
    }

    public static void main(String args[]) {
        Daemon_Thread obj1 = new Daemon_Thread();
        Daemon_Thread obj2 = new Daemon_Thread();

        obj1.setName("Ivy Fernandes");
        obj2.setName("Raaj Kanchan");

        obj1.setDaemon(true);

        obj1.start();
        obj2.start();
    }
}
