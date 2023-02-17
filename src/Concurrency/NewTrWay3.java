package Concurrency;

public class NewTrWay3 {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a new thread.");
            }
        };

        // Providing a Runnable object to the Thread constructor:
        Thread myThread = new Thread(myRunnable);
        myThread.start();

    }

}
