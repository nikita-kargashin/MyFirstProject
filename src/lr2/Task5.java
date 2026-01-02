package lr2;

import java.util.Scanner;

public class Task5 {
	static void main() 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = userInput.nextInt();
		int nOf1000 = 0;
		
		while (number >= 1000) {
			number /= 10;
			nOf1000++;
		}
		
		System.out.printf("\nТысяч в числе: %d\n", nOf1000);
		
		userInput.close();
	}
}