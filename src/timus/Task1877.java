package timus;

import java.util.Scanner;

class Task1877 {
    void main() {
        Scanner userInput = new Scanner(System.in);
        if ((userInput.nextInt() & 1) == 0 || (userInput.nextInt() & 1) == 1) IO.println("yes");
        else IO.println("no");
    }
}
