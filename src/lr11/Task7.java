package lr11;

import java.util.List;

public class Task7 {
    static void main() { System.out.println(getStringsLongerThan(List.of("one", "two", "three", "four"), 4)); }
    static List<String> getStringsLongerThan(List<String> strings, int length) {
        return strings.stream().filter(s -> s.length() > length).toList();
    }
}
