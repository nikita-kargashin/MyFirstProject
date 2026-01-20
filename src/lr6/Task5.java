package lr6;

public class Task5 {
    static void main() {
        int n = 5;
        System.out.println(SumOfPow2.getSum(n) + " = " + (n * (n + 1) * (2 * n + 1) / 6));
    }
}

class SumOfPow2 {
    static long getSum (int n) {
        if (n <= 1) return 1;
        return (long) n * n + getSum(n - 1);
    }
}