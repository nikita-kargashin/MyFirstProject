package lr11;

import java.util.List;

public class Task10 {
    static void main() { System.out.println(getNumbersLessThan(List.of(1, 2, 3, 4, 5), 3)); }
    static List<Integer> getNumbersLessThan(List<Integer> numbers, int number) {
        return numbers.stream().filter(n -> n < number).toList();
    }
}
