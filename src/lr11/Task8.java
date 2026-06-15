package lr11;

import java.util.List;

public class Task8 {
    static void main() { System.out.println(getNumbersGreaterThan(List.of(1 ,2 ,3 ,4 ,5 ), 3)); }
    static List<Integer> getNumbersGreaterThan(List<Integer> numbers, int number) {
        return numbers.stream().filter(n -> n > number).toList();
    }
}
