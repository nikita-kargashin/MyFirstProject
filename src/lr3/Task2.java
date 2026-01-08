package lr3;

import java.util.Scanner;

class Task2 {
    void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите название дня недели: ");
        String weekDay = userInput.nextLine().toLowerCase();
        int nOfDay = 0;

//        if (weekDay.equals("понедельник")) nOfDay = 1;
//        else if (weekDay.equals("вторник")) nOfDay = 2;
//        else if (weekDay.equals("среда")) nOfDay = 3;
//        else if (weekDay.equals("четверг")) nOfDay = 4;
//        else if (weekDay.equals("пятница")) nOfDay = 5;
//        else if (weekDay.equals("суббота")) nOfDay = 6;
//        else if (weekDay.equals("воскресенье")) nOfDay = 7;

        switch (weekDay) {
            case "понедельник":
                nOfDay = 1;
                break;
            case "вторник":
                nOfDay = 2;
                break;
            case "среда":
                nOfDay = 3;
                break;
            case "четверг":
                nOfDay = 4;
                break;
            case "пятница":
                nOfDay = 5;
                break;
            case "суббота":
                nOfDay = 6;
                break;
            case "воскресенье":
                nOfDay = 7;
                break;
        }

        System.out.println((nOfDay != 0) ? (nOfDay) : "Такого дня нет");

        userInput.close();
    }
}