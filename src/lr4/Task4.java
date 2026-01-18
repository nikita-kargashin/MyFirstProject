package lr4;

class Task4 {
    static void main() {
        final int w = 33, h = 10;

        char[][] rect = new char[h][w];

        IO.println();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
            {
                rect[i][j] = (j < Math.round(i * (w/ (float) h)) + 1) ? '·' : ' ';
                IO.print(rect[i][j]);
            }
            IO.println();
        }
    }
}