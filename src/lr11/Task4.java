package lr11;

import java.util.List;

public class Task4 {
    static void main() { System.out.println(getSqr(List.of(1d, 2d, 3d, 5d))); }
    static List<Double> getSqr(List<Double> list) { return list.stream().map(n -> Math.pow(n, 2)).toList(); }
}
