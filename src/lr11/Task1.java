package lr11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    static void main() {
        System.out.println(Arrays.toString(
                getEven(IntStream.iterate(1, n -> n + 1).limit(100).toArray())));
    }
    static int[] getEven(int[] numbers) { return Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray(); }
}
