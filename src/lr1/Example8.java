package lr1;

import java.util.Scanner;

public class Example8
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Today's day of the week: ");
        String dayOfTheWeek = userInput.nextLine();

        System.out.print("Today's month: ");
        String month = userInput.nextLine();

        System.out.print("Today's day number: ");
        int day = userInput.nextInt();

        System.out.printf("\nToday is %s %d, %s\n", month, day, dayOfTheWeek);
        userInput.close();
    }
}