package lr9;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>(Map.of(
                0, "ноль",
                2, "два",
                3, "три",
                4, "четыре",
                5, "пять",
                6, "шесть",
                7, "семь",
                8, "восемь",
                9, "девять",
                10, "десять"
                ));

        boolean hasZeroKey = map.containsKey(0);
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            if (k > 5) System.out.print(hasZeroKey ? (v + ", ") : "Строка найдена\n");
            if (v.length() > 5) result *= k;
        }
        System.out.println(result);
    }
}
