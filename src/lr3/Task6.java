package lr3;

import java.util.Scanner;

class Task6 {
    void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int arraySize = userInput.nextInt();
        if (arraySize < 1) {
            System.out.println("Некорректное значение");
            userInput.close();
            return;
        }
        int[] numbers = new int[arraySize];

        for (int i = 0, j = 0; i < arraySize; i++, j++) {
            while (j % 5 != 2) j++;
            numbers[i] = j;
            System.out.printf("%d ", numbers[i]);
        }

        userInput.close();
    }
}