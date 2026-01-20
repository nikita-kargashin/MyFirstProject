package lr6;

public class Task8 {
    static void main() {
        System.out.println(AvgFromArr.getAvg(new int[]{1, 2, 3}));
    }
}

class AvgFromArr {
    static double getAvg(int[] arr) {
        double result = 0;
        for (int i : arr) result += i;
        return result / arr.length;
    }
}
