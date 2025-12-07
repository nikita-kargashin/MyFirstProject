package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Your age: ");
        int yearOfBirth = Year.now().getValue() - userInput.nextInt();

        System.out.printf("\nYour birth year is %d or %d\n", yearOfBirth, (yearOfBirth + 1));
        userInput.close();
    }
}