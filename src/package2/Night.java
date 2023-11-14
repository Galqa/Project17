package package2;

public class Night {
    synchronized void test2(Day tc1) {
        System.out.println("test2() method of Night is running");
        try { Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tc1.last();
    }
    synchronized void last() {
        System.out.println("last() method of Night is running");
    }
}

