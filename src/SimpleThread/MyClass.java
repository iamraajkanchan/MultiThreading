package SimpleThread;

public class MyClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }
}
