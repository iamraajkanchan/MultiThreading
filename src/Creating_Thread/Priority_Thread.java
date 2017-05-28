package Creating_Thread;

public class Priority_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }

        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String args[]) {
        Priority_Thread obj1 = new Priority_Thread();
        Priority_Thread obj2 = new Priority_Thread();

        obj1.setName("Raaj Kanchan");
        obj2.setName("Ivy Fernandes");

        obj1.setPriority(MIN_PRIORITY);
        obj2.setPriority(MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }

}
