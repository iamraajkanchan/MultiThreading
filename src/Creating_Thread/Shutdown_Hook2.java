package Creating_Thread;

public class Shutdown_Hook2 {

    public static void main(String args[]) throws Exception {
        Runtime runnable = Runtime.getRuntime();
        // An anonymous class created below
        runnable.addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("Shutdown Hook task completed");
            }
        });

        System.out.println("Now main sleeping");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
