package lr9;

import java.util.Scanner;

public class Task3 {
    static void main() { printArray(createArray(new Scanner(System.in))); }

    static int[] createArray(Scanner userInput) {
        System.out.println("Размер массива: ");
        int[] arr = new int[userInput.nextInt()];
        fillArray(arr, userInput);
        return arr;
    }
    static void fillArray(int[] arr, Scanner userInput) { fillArray(arr, 0, userInput); }
    static void fillArray(int[] arr, int i, Scanner userInput) {
        System.out.printf("Элемент #%d: ", i);
        arr[i] = userInput.nextInt();
        if (++i < arr.length) fillArray(arr, i, userInput);
    }

    static void printArray(int[] arr) {
        System.out.println();
        printArray(arr, arr.length);
    }
    static void printArray(int[] arr, int i) {
        if (--i > 0) printArray(arr, i );
        System.out.println(arr[i]);
    }
}
