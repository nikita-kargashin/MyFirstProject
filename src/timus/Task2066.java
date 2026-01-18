package timus;

import java.util.Arrays;
import java.util.Scanner;

class Task2066 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int[] i = {userInput.nextInt(), userInput.nextInt(), userInput.nextInt()};
        Arrays.sort(i);
        IO.println(i[0] - i[1] * i[2]);
    }
}