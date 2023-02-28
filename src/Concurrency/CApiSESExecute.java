package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CApiSESExecute {
    static int a = 0;

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        final var mainThread = Thread.currentThread();

        try {
            Runnable task1 = () -> System.out.println("Hello Task1");
            Callable<String> task2 = () -> "Task2---------------------------------------";
            Runnable task3 = () -> System.out.println("Hello Task3");
            Runnable task4 = () -> System.out.println("Hello Task4");
            ScheduledFuture<?> r1 = service.schedule(task1, 0, TimeUnit.SECONDS);
            ScheduledFuture<String> r2 = service.schedule(task2, 0, TimeUnit.SECONDS);
            service.scheduleWithFixedDelay(task3, 0, 5, TimeUnit.SECONDS);
            service.scheduleAtFixedRate(task4, 0, 5, TimeUnit.SECONDS);// first value is initial and last is every unit
            // System.out.println(r2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finishes");
            // service.shutdownNow();
        }

        // System.out.println(r2);
    }

}
