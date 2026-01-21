package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task1209 {
    static void main() {
        Scanner userInput = new Scanner(System.in);

        int n = userInput.nextInt();
        int[] numbers = new int[n];
        boolean[] is1;

        for (int i = 0; i < n; i++) {
            numbers[i] = userInput.nextInt();
        }
        Arrays.sort(numbers);
        is1 = new boolean[numbers[numbers.length - 1]];
        Arrays.fill(is1, false);

        for (int i = 0, j = 0, k = 0; i < is1.length; i++) {
            if (j == 0) {
                is1[i] = true;
                k++;
            }
            j++;
            if (j == k) j = 0;
        }

        for (int i : numbers) System.out.print(((is1[i - 1]) ? 1 : 0) + " ");
    }
}
