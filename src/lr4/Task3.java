package lr4;

class Task3 {
    static void main (){
        final int h = 10, w = 15;

        int[][] rect = new int[h][w];

        IO.println();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                rect[i][j] = 2;
                IO.print(rect[i][j] + " ");
            }
            IO.println();
        }
    }
}