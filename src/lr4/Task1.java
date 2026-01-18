package lr4;

class Task1 {
    static void main () {
        final int w = 23, h = 11;

        IO.println();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                IO.print(
                        switch (i) {
                            case 0       -> (j == 0) ? "┌" : ((j == w - 1) ? "┐" : "─");
                            case (h - 1) -> (j == 0) ? "└" : ((j == w - 1) ? "┘" : "─");
                            default      -> (j == 0 || j == w - 1) ? ("│") : (" ");
                        }
                );
            }
            IO.println();
        }
    }
}