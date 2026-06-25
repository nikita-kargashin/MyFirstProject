package lr12;

import java.time.LocalTime;

public class Task1 {
    static void main() {
        Runnable printNameAndTime = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try { Thread.sleep(1000); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        };
        new Thread(printNameAndTime).start();
        new Thread(printNameAndTime).start();
    }
}
