package package2;

public class Day {
    synchronized void test1(Night tc2) {
        System.out.println("test1() method of Day is running");
        try { Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tc2.last();
    }
    synchronized void last() {
        System.out.println("last() method of Day is running");
    }
}
