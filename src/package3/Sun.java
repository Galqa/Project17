package package3;

public class Sun {
    private final Object lock;

    public Sun(Object lock) {
        this.lock = lock;
    }

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Sun is running...");
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
