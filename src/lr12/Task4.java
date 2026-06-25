package lr12;

public class Task4 {
    static void main() {
        for (int i = 0; i++ < 10;) new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
