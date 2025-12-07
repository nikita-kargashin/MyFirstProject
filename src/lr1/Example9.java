package lr1;

import java.util.List;
import java.util.Scanner;

public class Example9
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Month: ");
        String month = userInput.nextLine().toLowerCase();

        int correctAnswer = 0;

        if (List.of("january", "march", "may", "july", "august", "october", "december").contains(month))
        {
            correctAnswer = 31;
        }
        else if (List.of("april", "june", "september", "november").contains(month))
        {
            correctAnswer = 30;
        }
        else if (month.equals("february"))
        {
            correctAnswer = 28;
        }

        if (correctAnswer != 0)
        {
            System.out.print("Number of days in the month: ");
            int numberOfDays = userInput.nextInt();
            if (numberOfDays == 29) numberOfDays--;
            System.out.println((numberOfDays == correctAnswer) ? "\nCorrect" : "\nIncorrect");
        }
        else System.out.println("\nThere is no such month");

        userInput.close();
    }
}