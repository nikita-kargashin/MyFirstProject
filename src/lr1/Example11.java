package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = userInput.nextLine();

        System.out.print("Your birth year: ");
        int age = Year.now().getValue() - userInput.nextInt();

        System.out.printf("\nYour name is %s and you are %d or %d years old\n", name, (age - 1), age);
        userInput.close();
    }
}