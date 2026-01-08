package lr3;

import java.util.Scanner;

class Task1 {
    void main () {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");

        System.out.println(
                switch (userInput.nextInt()) {
                    case 1 -> "Понедельник";
                    case 2 -> "Вторник";
                    case 3 -> "Среда";
                    case 4 -> "Четверг";
                    case 5 -> "Пятница";
                    case 6 -> "Суббота";
                    case 7 -> "Воскресенье";
                    default -> "Неверный ввод";
                }
        );

        userInput.close();
    }
}