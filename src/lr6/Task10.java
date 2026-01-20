package lr6;

public class Task10 {
    static void main() {

    }
}

class MaxMinArr {
    static int[] getArr (int... arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (max < i) max = i;
            if (min > i) min = i;
        }

        return (new int[]{max, min});
    }
}
