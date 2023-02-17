package Concurrency;

//Implementing the Runnable interface:
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("This is a new thread.");
    }
}

public class NewTrWay2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
