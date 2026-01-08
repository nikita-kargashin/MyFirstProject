package lr3;

import java.util.Scanner;

class Task3{
    void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");

//        int[] numbers = new int[userInput.nextInt()];
//        for (int i = 0; i < numbers.length; i++) numbers[i] = (i >= 2) ? numbers[i - 1] + numbers [i - 2] : 1;
//        for (int number : numbers) System.out.printf("%d ", number);

        int i = userInput.nextInt(), firstN = 0, secondN = 1;
        while (i-- > 0) {
            System.out.printf("%d ", secondN);
            int tmp = secondN;
            secondN += firstN;
            firstN = tmp;
        }

        userInput.close();
    }
}