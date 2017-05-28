package Thread_Pool;

public class Worker_Thread implements Runnable {

    private String msg;

    public Worker_Thread(String s) {
        this.msg = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(" + "Start" + ") message = " + msg);

        // This method is used to apply concurrency in threads
        process_Message();

        System.out.println(Thread.currentThread().getName() + " End");
    }

    public void process_Message() {
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
