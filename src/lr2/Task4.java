package lr2;

import java.util.Scanner;

public class Task4 {
	static void main() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = userInput.nextInt();
		
		
		
		System.out.print("\nЧисло критериям " + 
				((number  >= 5 && number <= 10) ? "" : "не ") + "удовлетворяет\n");
		
		userInput.close();
	}
}