package package3;

public class Moon {
    private final Object lock;

    public Moon(Object lock) {
        this.lock = lock;
    }

    public void doSomething() {

        synchronized (lock) {
            System.out.println("Moon is running...");
            lock.notify();
            try {
                lock.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}
