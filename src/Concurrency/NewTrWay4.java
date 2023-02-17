package Concurrency;

public class NewTrWay4 {
    public static void main(String[] args) {
        // Providing a lambda expression to the Thread constructor:
        Thread myThread = new Thread(() -> {
            System.out.println("This is a new thread.");
        });

        myThread.start();

    }
}
