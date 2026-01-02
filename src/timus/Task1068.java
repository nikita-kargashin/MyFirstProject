package timus;

import java.util.Scanner;

class Task1068 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        int result = 0;

        for (int i = 1, nAbs = Math.abs(n); i <= nAbs; i++) {
            result += i;
        }
        if (n < 0) result = -(result - 1);

        System.out.println(result);

        userInput.close();
    }
}