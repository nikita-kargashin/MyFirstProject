package lr2;

import java.util.Scanner;

public class Task1 {
	static void main() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = userInput.nextInt();
		
		System.out.print((number % 3 == 0) ? "\nДелится на 3\n" : "\nНе делится на 3\n");
		
		userInput.close();
	}
}