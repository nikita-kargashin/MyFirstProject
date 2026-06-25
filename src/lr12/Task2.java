package lr12;

public class Task2 {
    static void main() {
        new Thread(() -> {
            for (int i = 0; i++ < 10;) {
                System.out.println(i);
                try { Thread.sleep(1000); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        }).start();
    }
}
