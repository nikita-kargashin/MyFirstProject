package timus;

import java.util.Scanner;

class Task1001 {
    void main() {
        Scanner userInput = new Scanner(System.in);
        int arraySize = 4;
        long[] arr = new long[arraySize];

        for (int i = 0; i < arraySize; i++) arr[i] = userInput.nextLong();
        for (int i = arraySize - 1; i >= 0; i--) System.out.printf("%.4f\n", Math.sqrt(arr[i]));

        userInput.close();
    }
}