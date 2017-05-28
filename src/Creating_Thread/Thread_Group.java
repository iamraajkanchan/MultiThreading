package Creating_Thread;
public class Thread_Group implements Runnable
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        
        try{
            Thread.sleep(300);
        }
        catch(Exception e){
            e.getMessage();
        }
    }
    
    public static void main (String args[]){
        
        Thread_Group runnable = new Thread_Group();
        
        ThreadGroup t_group = new ThreadGroup("Parent Thread Group");
        
        Thread t1 = new Thread(t_group, runnable, "One");
        Thread t2 = new Thread(t_group, runnable, "Two");
        Thread t3 = new Thread(t_group, runnable, "Three");
        Thread t4 = new Thread(t_group, runnable, "Four");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("Thread Group Name : " + t_group.getName());
        t_group.list();
    }
}
