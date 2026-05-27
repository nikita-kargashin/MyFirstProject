package lr9;

import java.util.Scanner;

public class Task2 {
    static void main() { for (boolean i : toBinary(new Scanner(System.in).nextInt())) System.out.print((i) ? 1 : 0); }

    private static boolean[] toBinary(int n) {
        int l = 1;
        for (int i = 2; i <= n; i *= 2) l++;
        return toBinary(n, new boolean[l], l - 1);
    }
    private static boolean[] toBinary(int n, boolean[] result, int i) {
        result[i] = (n % 2 == 1);
        if (i == 0) return result;
        return toBinary(n / 2, result, i - 1);
    }
}
