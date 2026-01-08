package timus;

import java.util.Scanner;

class Task1000 {
    void main () {
        Scanner userInput = new Scanner(System.in);
        System.out.println(userInput.nextInt() + userInput.nextInt());
        userInput.close();
    }
}