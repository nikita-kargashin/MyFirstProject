package lr13.Task2;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example1 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введите числа или пустую строку для завершения ввода:");
        try {
            for (String str; !(str = userInput.nextLine()).isEmpty(); numbers.add(Integer.parseInt(str)));
            System.out.println(numbers.stream().filter(i -> i > 0).reduce(Integer::sum)
                    .orElseThrow(NoSuchElementException::new));
        }
        catch (NumberFormatException _) { System.out.println("Можно вводить только числа!"); }
        catch (NoSuchElementException _) { System.out.println("Положительных чисел нет!"); }
    }
}
