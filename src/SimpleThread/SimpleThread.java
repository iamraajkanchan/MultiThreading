package SimpleThread;

public class SimpleThread {

    public static void main(String args[]) {
        System.out.println("Main Thread Begins");
        MyClass obj = new MyClass();
        obj.start();
        System.out.println("Main Thread Ends");
    }
}
