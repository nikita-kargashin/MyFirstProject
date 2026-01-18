package lr4;

class Task6 {
    static void main() {
        final int w = 4, h = 3;

        int[][] initialArray = new int[h][w];
        int[][] smallerArray = new int[h - 1][w - 1];

        for (int i = 0, iToExclude = (int) (Math.random() * h), jToExclude = (int) (Math.random() * w); i < h; i++)
            for (int j = 0; j < w; j++) {
                initialArray[i][j] = (int) (Math.random() * 10);
                if (i != iToExclude && j != jToExclude)
                    smallerArray[(i < iToExclude) ? i : (i - 1)][(j < jToExclude ? j : (j - 1))] = initialArray[i][j];
            }

        IO.println();
        for (int[] numbers : initialArray) {
            for (int number : numbers) IO.print(number + " ");
            IO.println();
        }

        IO.println();
        for (int[] numbers : smallerArray) {
            for (int number : numbers) IO.print(number + " ");
            IO.println();
        }
    }
}