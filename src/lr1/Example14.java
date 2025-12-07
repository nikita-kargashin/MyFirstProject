package lr1;

import java.util.Scanner;

public class Example14
{
    static void main()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Number: ");
        int n = userInput.nextInt();

        System.out.printf("\n%d %d %d %d\n",(n - 1), n, (n + 1), ((3 * n)) * (3 * n));

        userInput.close();
    }
}