/** Створити 2 класи. Реалізувати взаємне блокування цих класів.
 */


package package2;

public class Dispute {
    public static void main(String[] args) {
        Day tc1 = new Day();
        Night tc2 = new Night();

        Thread t1 = new Thread(() -> tc1.test1(tc2));
        t1.start();

        Thread t2 = new Thread(() -> tc2.test2(tc1));
        t2.start();
    }
}
