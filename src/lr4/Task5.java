package lr4;

class Task5 {
    static void main() {
        final int w = 5, h = 7;

        int[][] initialArray = new int[h][w];
        int[][] flippedArray = new int[w][h];

        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++) flippedArray[j][i] = initialArray[i][j] = (int) (Math.random() * 10);

        IO.println();
        for (int[] numbers : initialArray) {
            for (int number : numbers) IO.print(number + " ");
            IO.println();
        }

        IO.println();
        for (int[] numbers : flippedArray) {
            for (int number : numbers) IO.print(number + " ");
            IO.println();
        }
    }
}