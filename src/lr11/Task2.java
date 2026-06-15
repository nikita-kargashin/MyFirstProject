package lr11;

import java.util.*;
import java.util.stream.*;

public class Task2 {
    static void main() {
        int[] result = getOverlap(IntStream.range(1, 100).toArray(), new Random().ints(10, 0, 100).toArray());
        System.out.println(Arrays.toString(result));
    }
    static int[] getOverlap(int[] numbers1, int[] numbers2) {
        Set<Integer> set = Arrays.stream(numbers2).boxed().collect(Collectors.toSet());
        return Arrays.stream(numbers1).filter(set::contains).distinct().toArray();
    }
}
