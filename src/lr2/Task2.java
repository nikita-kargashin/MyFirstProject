package lr2;

import java.util.Scanner;

public class Task2 {
	static void main() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = userInput.nextInt();
		
		System.out.print("\nЧисло критериям " + 
				((number % 5 == 2 && number % 7 == 1) ? "" : "не ") + "удовлетворяет\n");
		
		userInput.close();
	}
}