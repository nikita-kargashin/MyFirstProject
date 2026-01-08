package lr3;

import java.util.Scanner;

class Task5 {
    void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");

        for (int i = userInput.nextInt(), j = 0; i > 0; i--) {
            while ((j % 3 != 1) && (j % 5 != 2)) j++;
            System.out.printf("%d ", j++);
        }

        userInput.close();
    }
}