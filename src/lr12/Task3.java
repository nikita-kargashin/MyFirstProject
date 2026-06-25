package lr12;

public class Task3 {
    private static int number = 0;

    static void main() {
        final Object lock = new Object();
        Runnable incAndPrint = () -> {
            synchronized (lock) {
                while (number++ < 10) {
                    lock.notify();
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    try { lock.wait(); }
                    catch (InterruptedException e) { throw new RuntimeException(e); }
                }
                lock.notify();
            }
        };

        new Thread(incAndPrint).start();
        new Thread(incAndPrint).start();
    }
}
