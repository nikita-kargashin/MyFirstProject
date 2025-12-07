package lr1;

import java.util.Scanner;

public class Example13
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("First number: ");
        int sum = userInput.nextInt();

        System.out.print("Second number: ");
        sum += userInput.nextInt();

        System.out.printf("\nSum: %d\n",sum);
        userInput.close();
    }
}