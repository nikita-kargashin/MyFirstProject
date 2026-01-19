package lr5;

class Task6 {
    static void main() {
        MinMax test = new MinMax(10, 5);
        test.test();

        test.addNewValue(25);
        test.test();

        test.addNewValue(10, 65);
        test.test();

        test.addNewValue(15, 50);
        test.test();
    }
}

class MinMax {
    private int min, max;

    MinMax(int i, int j) {
        if (i > j) {
            min = j;
            max = i;
        } else {
            min = i;
            max = j;
        }
    }
    MinMax(int i) { min = max = i; }

    void addNewValue(int i, int j) {
        addNewValue(i);
        addNewValue(j);
    }
    void addNewValue(int i) {
        if      (i > max) max = i;
        else if (i < min) min = i;
    }

    void test() {
        IO.println(min + " " + max);
    }
}