package Creating_Thread;
public class Shutdown_Hook extends Thread
{
    @Override
    public void run (){
        System.out.println("Shutdown hook task has been completed");
        
    }
    
    public static void main(String args[]){
        Runtime runnable = Runtime.getRuntime();
        runnable.addShutdownHook(new Thread());
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(300);
        }
        catch(Exception e){
            e.getMessage();
        }
        
    }
}
