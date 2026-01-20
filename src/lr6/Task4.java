package lr6;

public class Task4 {
    static void main() {
        System.out.println(DoubleFactorial.getF(6));
    }
}

class DoubleFactorial {
    static long getF (int n) {
        if (n < 1) return 1;
        if (n <= 2) return (n);
        return n * getF(n - 2);
    }
}