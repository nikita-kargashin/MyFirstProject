package lr4;

class Task7 {
    static void main() {
        final int w = 5, h = 5;

        char[][] snakeArr = new char[h][w];

        for (int i = 0, letter = 'a'; i < h; i++)
            for (int j = 0; j < w; j++, letter = (letter < 'z') ? letter + 1 : 'a')
                snakeArr[i][((i & 1) == 1) ? (w - j - 1) : j] = (char) letter;

        IO.println();
        for (char[] letters : snakeArr) {
            for (char letter : letters) IO.print(letter + " ");
            IO.println();
        }
    }
}