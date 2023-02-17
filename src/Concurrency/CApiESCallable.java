package Concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CApiESCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get()); // 41
        } finally {
            service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MINUTES);
        // Check whether all tasks are finished
        if (service.isTerminated())
            System.out.println("Finished!");
        else
            System.out.println("At least one task is still running");

    }
}
