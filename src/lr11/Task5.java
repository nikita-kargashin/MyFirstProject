package lr11;

import java.util.List;

public class Task5 {
    static void main() { System.out.println(getStringsWithSubstring(List.of("one", "two", "three"), "wo")); }
    static List<String> getStringsWithSubstring(List<String> strings, String substring) {
        return strings.stream().filter(s -> s.contains(substring)).toList();
    }
}
