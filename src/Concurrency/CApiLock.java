package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CApiLock {
    int a = 0;

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            // lock.unlock();
            System.out.println("Hello Hi");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();// opti
        new Thread(() -> printHello(lock)).start();
        /**
         * tryLock() vs tryLock(4,unit); lock.tryLock() lock.tryLock(4, TimeUnit.SECONDS)
         */
        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lock.unlock();
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

}
