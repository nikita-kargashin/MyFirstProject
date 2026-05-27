package lr9;

public class Task4 {
    static void main() { printX(1); }

    static void printX (int x) {
        if (x <= 0 || x >= 20) return;
        System.out.println(x);
        printX(2 * x + 1);
    }
}

