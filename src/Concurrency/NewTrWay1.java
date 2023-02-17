package Concurrency;

//Extending the Thread class:
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is a new thread.");
    }
}

public class NewTrWay1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
