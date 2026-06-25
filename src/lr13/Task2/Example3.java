package lr13.Task2;

import java.util.Scanner;

public class Example3 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int result = 0;

        System.out.println("Введите байты или пустую строку для завершения ввода: ");
        try {
            for (String str; !(str = userInput.nextLine()).isEmpty(); )
                if ((result += Byte.parseByte(str)) > Byte.MAX_VALUE || result < Byte.MIN_VALUE) throw new ArithmeticException();
            System.out.println(result);
        }
        catch (NumberFormatException _) { System.out.println("Можно вводить только байты!"); }
        catch (ArithmeticException _) { System.out.println("Сумма выходит за пределы значений байта!"); }
    }
}
