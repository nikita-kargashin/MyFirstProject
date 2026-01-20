package timus;

import java.util.Scanner;

public class Task2012 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int i = userInput.nextInt();
        System.out.println((i + (60 * 4 / 45) >= 12) ? "YES" : "NO");
    }
}
