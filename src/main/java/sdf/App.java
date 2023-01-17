package sdf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // Thread thread1 = new Thread(new Runnable(){
            
        //     @Override
        //     public void run(){
        //         for (int i=0;i<5;i++){
        //             System.out.println(Thread.currentThread().getName()+ "\tRunnable ..."+i); 
        //         }
        //     }
        // });
        // thread1.start();

        MyRunnableImplementation mRI = new MyRunnableImplementation("Task 1");
        MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task 2");
        MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task 3");
        MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task 4");
        MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task 5");
        // Thread thread2 = new Thread(mRI);
        // thread2.run();

        // Thread thread3 = new Thread(mRI);
        // thread3.run();

        // //excuting a thread in a thread pool
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        // //excute on fixe number of threads
        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        //depend on the number of core in machine
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(mRI);
        executorService.execute(mRI2);
        executorService.execute(mRI3);
        executorService.execute(mRI4);
        executorService.execute(mRI5);
        executorService.shutdown();

    }
}
