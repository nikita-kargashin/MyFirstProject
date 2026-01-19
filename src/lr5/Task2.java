package lr5;

class Task2 {
    static void main() {
        LetterPriner.print();
    }
}

class LetterPriner {
    private static char firstLetter  = 'A';
    private static char secondLetter = 'D';

    static void print() {
        for (char ch = firstLetter; ch <= secondLetter; IO.println(ch++));
    }
}