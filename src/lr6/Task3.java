package lr6;

public class Task3 {
    static void main() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(MaxMinAvg.getMax(arr));
        System.out.println(MaxMinAvg.getMin(arr[0], arr[1], arr[2]));
        System.out.println(MaxMinAvg.getAverage(arr));
    }
}

class MaxMinAvg {
    static int getMax(int... iArr) {
        if (iArr.length == 0) return 0;

        int result = Integer.MIN_VALUE;
        for (int i : iArr) if (i > result) result = i;
        return result;
    }
    static int getMin(int... iArr) {
        if (iArr.length == 0) return 0;

        int result = Integer.MAX_VALUE;
        for (int i : iArr) if (i < result) result = i;
        return result;
    }
    static float getAverage(int... iArr) {
        if (iArr.length == 0) return 0;

        float result = 0;
        for (int i : iArr) result += i;
        result /= iArr.length;
        return result;
    }
}
