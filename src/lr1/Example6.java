package lr1;

import java.util.Scanner;

public class Example6
{
     static void main()
     {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Your last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Your first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Your patronym: ");
        String patronym = userInput.nextLine();

        System.out.printf("\nHello %s %s %s\n", lastName, firstName, patronym);
        userInput.close();
    }
}