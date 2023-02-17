package Concurrency;

public class ThreadExample implements Runnable {
    private String threadName;

    public ThreadExample(String name) {
        this.threadName = name;
        System.out.println("Creating thread " + this.threadName);
    }

    @Override
    public void run() {
        System.out.println("Running thread " + this.threadName);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + this.threadName + " is executing task " + i);
                Thread.sleep(1000);
                Thread.interrupted();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interrupted.");
        }
        System.out.println("Thread " + this.threadName + " exiting.");
    }

    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        ThreadExample t1 = new ThreadExample("Thread 1");
        ThreadExample t2 = new ThreadExample("Thread 2");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        System.out.println("Main thread exiting.");
    }
}
