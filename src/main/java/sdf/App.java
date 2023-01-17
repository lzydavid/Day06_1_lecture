package sdf;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // //LAMBDA        
        // MyRunnableInterface<Integer> addOperation = (a,b) -> {
        //     return a+b;
        // };

        // MyRunnableInterface<Integer> mutipleOperation = (a,b) -> {
        //     return a*b;
        // };

        // MyRunnableInterface<Integer> subtractOperation = (a,b) -> {
        //     return a-b;
        // };

        // MyRunnableInterface<String> concatSTring = (a,b) -> {
        //     return a+b;
        // };

        // MyMessageInterface printString = (a) -> {
        //     System.out.println(a);
        // };

        // System.out.println("addOperation: " + addOperation.process(1,1));

        // System.out.println("addOperation: " + mutipleOperation.process(2,5));

        // System.out.println("addOperation: " + subtractOperation.process(10,5));

        // System.out.println("addOperation: " + concatSTring.process("The quick brown fox ","jumps over the wall. "));
        
        // printString.printMessage("Lets take a break at 12pm.");


        List<Employee> employess = new ArrayList<Employee>();
        employess.add(new Employee(1, "Adamn", "Cheong", 5000));
        employess.add(new Employee(2, "Bertram", "Chong", 7000));
        employess.add(new Employee(3, "Kelvin", "Ng", 8000));
        employess.add(new Employee(4, "Bernald", "Tan", 7000));
        employess.add(new Employee(5, "Donnie", "Yen", 10000));
        employess.add(new Employee(6, "Adamn", "Cheong", 5000));

        //employess.forEach(emp -> {System.out.println(emp);});
        System.out.println();

        //List<Employee> filterEmployees = employess.stream().filter(emp -> emp.getLastName().contains("Ch")).collect(Collectors.toList());

        //filterEmployees.forEach(emp -> System.out.println(emp));

        // employess.sort(Comparator.comparing(Employee::getFirstName).reversed());
        // employess.forEach(emp -> {
        //     System.out.println(emp);
        // });

        // Comparator<Employee> compare = Comparator.comparing(e -> e.getFirstName());
        // employess.sort(compare.reversed());

        Comparator<Employee> groupBComparator = Comparator.comparing(Employee::getFirstName).thenComparing(e->e.getLastName());
        employess.sort(groupBComparator);
        employess.forEach(emp->{
            System.out.println(emp);
        });
    }
}
