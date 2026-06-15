package lr11;

import java.util.List;

public class Task3 {
    static void main() { System.out.println(getCapitalizedStrings(List.of("One", "tWo", "ThrEe", "fOur", "", "FIVE"))); }
    static List<String> getCapitalizedStrings(List<String> strings) {
        return strings.stream().filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0))).toList();
    }
}
