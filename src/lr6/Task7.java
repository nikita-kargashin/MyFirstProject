package lr6;

public class Task7 {
    static void main() {
        for (int i : CharToInt.convert(new char[]{'a', 'b', 'c'})) System.out.println(i);
    }
}

class CharToInt {
    static int[] convert(char[] chArr) {
        int[] intArr = new int[chArr.length];
        for (int i = 0; i < chArr.length; i++) intArr[i] = chArr[i];
        return intArr;
    }
}
