package lr1;

import java.util.Scanner;

public class Example15
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Second number: ");
        int secondNumber = userInput.nextInt();

        System.out.printf("\n%d %d\n", (firstNumber + secondNumber), (firstNumber - secondNumber));
        userInput.close();
    }
}