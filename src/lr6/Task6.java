package lr6;

import java.util.Arrays;

public class Task6 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : FirstElements.getElements(arr, 3)) System.out.println(i);
    }
}

class FirstElements {
    static int[] getElements (int[] arr, int n) {
        return Arrays.copyOf(arr, Math.min(arr.length, n));
    }
}
