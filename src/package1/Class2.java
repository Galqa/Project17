package package1;

public class Class2 {
    synchronized void printClass2() {
        System.out.println("2 клас");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Потік перервано");
        }
    }
}





