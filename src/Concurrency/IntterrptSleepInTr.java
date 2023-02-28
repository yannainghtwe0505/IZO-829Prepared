package Concurrency;

import java.time.LocalDateTime;

public class IntterrptSleepInTr {
    private static int counter = 0;

    public static void main(String[] a) {
        // call current thread mean thread that hold lambada expression
        final var mainThread = Thread.currentThread();
        System.out.println(LocalDateTime.now());
        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++)
                counter++;
            mainThread.interrupt();
        }).start();
        while (counter < 1_000_000) {
            System.out.println("Not reached yet");
            // System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(1000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println(LocalDateTime.now());
        System.out.println("Reached: " + counter);
    }
}
