/**
 * Усі можливі способи (які Ви знаєте) вирішити проблему взаємного блокування.
 */

package package3;

public class Way {
    public static void main(String[] args) {
        Object lock = new Object();
        Moon moon = new Moon(lock);
        Sun sun = new Sun(lock);

        Thread thread1 = new Thread(moon::doSomething);
        Thread thread2 = new Thread(sun::doSomething);

        thread1.start();
        thread2.start();
    }
}
