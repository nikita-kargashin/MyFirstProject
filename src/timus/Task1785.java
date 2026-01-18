package timus;

import java.util.Scanner;

class Task1785 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int i = userInput.nextInt();
        if (i < 1) return;

        if      (i < 5)    IO.println("few");
        else if (i < 10)   IO.println("several");
        else if (i < 20)   IO.println("pack");
        else if (i < 50)   IO.println("lots");
        else if (i < 100)  IO.println("horde");
        else if (i < 255)  IO.println("throng");
        else if (i < 500)  IO.println("swarm");
        else if (i < 1000) IO.println("zounds");
        else               IO.println("legion");

        userInput.close();
    }
}
