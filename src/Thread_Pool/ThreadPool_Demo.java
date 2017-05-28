package Thread_Pool;
// We need to inderit the two following classes to test Thread Pool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool_Demo {
public static void main (String args[]){
    ExecutorService executor = Executors.newFixedThreadPool(5);
    
    for (int i = 0 ; i < 10 ; i++){
        Runnable worker = new Worker_Thread(" " + i);
    }
    
    executor.shutdown();
    
    while(! executor.isTerminated()){
        System.out.println("Finished all threads");
    }
}
}
