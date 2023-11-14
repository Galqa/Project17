/**
 * Затримка потоку.
 * Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
 * і коли ці потоки успішно відпрацюють – вивести на екран повідомлення (завершення потім first, second і main).
 */


public class Delay {
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.start();
    }
}

class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("First thread started...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("First thread finished...");
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second thread started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Second thread finished...");
    }
}

class MainThread extends Thread {
    @Override
    public void run() {
        System.out.println("Main thread started...");

        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }

        System.out.println("Main thread finished...");
    }
}

