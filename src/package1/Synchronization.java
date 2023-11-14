/** Створити 2 довільні класи з полями та методами.
 * Необхідно синхронізувати методи цих класів між собою, тобто.
 * щоб виводило на екран значення один за одним (1 клас, 2 клас, 1, 2 тощо).
 */


package package1;

public class Synchronization {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                class1.printClass1();
            }
        }).start();
     new Thread(() -> {
         for (int i = 0; i < 5; i++) {
             class2.printClass2();
         }
     }).start();
    }
}
