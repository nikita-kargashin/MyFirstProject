package lr2; 

import java.util.Scanner;

public class Task3 {
	static void main() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = userInput.nextInt();
		
		if (number % 4 == 0 && number >= 10) System.out.print("\nЧисло критерями удовлетворяет\n");
		else System.out.print("\nЧисло критерями не удовлетворяет\n");
		
		userInput.close();
	}
}