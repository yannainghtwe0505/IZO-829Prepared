package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CApiESExecute {
    public static void main(String[] args) {
        // call concurrency api ExecutorService for single thread,like create new thread and run instead of start
        ExecutorService service = Executors.newSingleThreadExecutor();
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };
        try {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
            //don`t forget to shudown if you use ExecutorService
            service.shutdown();
        }
    }
}
