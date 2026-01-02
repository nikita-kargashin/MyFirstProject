package timus;

import java.util.Scanner;

public class Task1293
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of panels, their width and height separated by spaces " +
                "(for example: 5 2 3)\n> ");
        String[] enteredString = userInput.nextLine().split(" ");

        int nOfPanels = Integer.parseInt(enteredString[0]);
        int wOfPanels = Integer.parseInt(enteredString[1]);
        int hOfPanels = Integer.parseInt(enteredString[2]);

        if (nOfPanels >= 1 && nOfPanels <= 100 && wOfPanels >= 1 && wOfPanels <= 100
                && hOfPanels >= 1 && hOfPanels <= 100)
        {
            System.out.printf("\n%d ng of sulfid needed\n", nOfPanels * wOfPanels * hOfPanels * 2);
        }
        else
        {
            System.out.println("\nWrong input. All three values should be >= 1 and <= 10\n");
            main();
        }

        userInput.close();
    }
}