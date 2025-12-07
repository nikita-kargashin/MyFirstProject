package lr1;

import java.util.Scanner;

public class Example7
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = userInput.nextLine();

        System.out.print("Your age: ");
        int age = userInput.nextInt();

        System.out.printf("\nYour name is %s and your age is %d\n", name, age);
        userInput.close();
    }
}