package lr3;

class Task7 {
    void main() {
        int arraySize = 10;
        char[] alphabet = new char[arraySize];

        for (int i = 0, j = 'a'; i < arraySize; i++, j += 2) {
            alphabet[i] = (char) j;
            System.out.printf("%c ", alphabet[i]);
        }
        System.out.println();
        for (int i = arraySize - 1; i >= 0; i--) System.out.printf("%c ", alphabet[i]);
    }
}