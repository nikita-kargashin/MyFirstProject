package lr6;

public class Task9 {
    static void main() {
        char[] arr = {'a','b','c','d','e'};
        CharSwapper.swap(arr);
        for (char c : arr) System.out.println(c);
    }
}

class CharSwapper {
    static void swap (char[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
