package timus;

import java.util.Scanner;

public class Task2001 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < 3; i++) {
            arr[0][i] = userInput.nextInt();
            arr[1][i] = userInput.nextInt();
        }
        System.out.println((arr[0][0] - arr[0][2]) + " " + (arr[1][0] - arr[1][1]));
    }
}
