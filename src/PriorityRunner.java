/** Демонстрація пріоритетів.
 * Створити 2 класи PriorityRunner та PriorityThread.
 * Запустити 3 потоки із пріоритетами (min, max, norm).
 * За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.
 */

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("Min");
        PriorityThread max = new PriorityThread("Max");
        PriorityThread norm = new PriorityThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Потік " + getName() + " почав роботу. Пріоритет: " + getPriority());
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        System.out.println("Потік " + getName() + "завершив роботу. Пріоритет: " + getPriority());
    }
}



