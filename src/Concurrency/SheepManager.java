package Concurrency;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
	public class SheepManager {
		AtomicInteger sheepCount = new AtomicInteger(0);
		 private void incrementAndReport() {
			 System.out.print(sheepCount.incrementAndGet()+" ");
		}
		 public static void main(String[] args) {
		 ExecutorService service = Executors.newFixedThreadPool(20);
		 try {
		SheepManager manager = new SheepManager();
		 for(int i = 0; i < 10; i++)
			 synchronized(manager) {
				 service.submit(() -> manager.incrementAndReport());
				}
		} finally {
		 service.shutdown();
		 }
		 }
	}