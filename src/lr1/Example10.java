package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example10
{
    static void main() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Year of your birth: ");
        int yearOfBirth = userInput.nextInt();

        int age = Year.now().getValue() - yearOfBirth;

        System.out.printf("\nYou are %d or %d years old\n", (age - 1), age);

        userInput.close();
    }
}