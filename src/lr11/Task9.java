package lr11;

import java.util.List;

public class Task9 {
    static void main() { System.out.println(getOnlyAlphabeticalStrings(List.of("123", "abc", "123abc"))); }
    static List<String> getOnlyAlphabeticalStrings(List<String> strings) {
        return strings.stream().filter(s -> s.chars().allMatch(Character::isAlphabetic)).toList();
    }
}
