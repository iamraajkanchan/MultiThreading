package Creating_Thread;

public class Properties_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println(" " + Thread.currentThread().getName());
            // Here concurrency has not been used intentionally to understand the concept in a better way
        }
    }// end of run

    public static void main(String args[]) {
        Properties_Thread obj1 = new Properties_Thread();
        Properties_Thread obj2 = new Properties_Thread();
        Properties_Thread obj3 = new Properties_Thread();

        obj1.setName("Ivy Fernandes");
        obj2.setName("I Love You");
        obj3.setName("Raaj Kanchan");

        display_properties(obj1);
        display_properties(obj2);
        display_properties(obj3);
    }// end of main

// Note: Here static keyword is used before display_properties because
// non static method display_properties(Properties_Thread obj) cannot be referenced from a static context
    public static void display_properties(Properties_Thread obj) {
        Properties_Thread disp_obj = obj;
        System.out.println("ID: " + disp_obj.getId());
        System.out.println("Class Name: " + disp_obj.getClass());
        System.out.println("Stack Trace: " + disp_obj.getStackTrace());
        System.out.println("State: " + disp_obj.getState());
        System.out.println("Default Priority: " + disp_obj.getPriority());
        System.out.println("Thread Group: " + disp_obj.getThreadGroup());
        obj.start();
    }// end of display_properties
}
