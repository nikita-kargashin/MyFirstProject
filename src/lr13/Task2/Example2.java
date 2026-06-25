package lr13.Task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    static void main() {
        int[][] matrix = new int[10][];
        Arrays.setAll(matrix, _ -> new Random().ints(10, 0, 100).toArray());
        System.out.println("Номер столбца: ");
        try {
            for (int i = 0, n = new Scanner(System.in).nextInt() - 1; i < matrix.length; i++)
                System.out.println(matrix[i][n]);
        }
        catch (InputMismatchException _) { System.out.println("Можно вводить только числа!"); }
        catch (IndexOutOfBoundsException _) { System.out.println("Нет такого столбца!"); }
    }
}
