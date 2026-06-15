package lr11;

import java.util.List;

public class Task6 {
    static void main() { System.out.println(getNumbersDivisibleBy(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)); }
    static List<Integer> getNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        return numbers.stream().filter(n -> n % divisor == 0).toList();
    }
}
