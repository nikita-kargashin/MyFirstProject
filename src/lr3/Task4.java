package lr3;

import java.util.Scanner;

class Task4 {
    void main () {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int smallerN = userInput.nextInt();
        System.out.print("Введите второе число: ");
        int largerN = userInput.nextInt();
        if (smallerN > largerN) {
            int tmp = smallerN;
            smallerN = largerN;
            largerN = tmp;
        }

        //for (int i = smallerN; i <= largerN; i++) System.out.printf("%d ", i);

        while (smallerN <= largerN) System.out.printf("%d ", smallerN++);

        userInput.close();
    }
}