package package1;


public class Class1 {
    synchronized void printClass1() {
        System.out.println("1 клас");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Потік перервано");
        }
    }
}
