package lr3;

class Task8 {
    void main() {
        char[] letters = new char[10];
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0, j = 0, k = 'A'; i < letters.length; i++, k++) {
            if (k == vowels[j]) {
                k++;
                j++;
            }
            letters[i] = (char) k;
            System.out.printf("%c ", letters[i]);
        }
    }
}