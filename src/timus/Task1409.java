package timus;

import java.util.Scanner;

class Task1409 {
    void main () {
        Scanner userInput = new Scanner(System.in);
        int i = userInput.nextInt(), j = userInput.nextInt();
        System.out.printf("%d %d", (j - 1), (i - 1));
        userInput.close();
    }
}