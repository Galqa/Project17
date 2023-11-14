
/** Створіть Daemon-потік і виведіть про нього якнайбільше інформації.
 */


public class Daemon {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println("ID потоку: " + daemonThread.getId());
        System.out.println("Ім'я потоку: " + daemonThread.getName());
        System.out.println("Пріоритет потоку: " + daemonThread.getPriority());
        System.out.println("Стан потоку: " + daemonThread.getState());
        System.out.println("Чи є потік демоном: " + daemonThread.isDaemon());

    }
}
