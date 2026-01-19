package lr5;

class Task3 {
    static void main() {
        ConstructorsTest test = new ConstructorsTest();
        test = new ConstructorsTest(1);
        test = new ConstructorsTest(1, 1);

    }
}

class ConstructorsTest {
    private int a, b;

    ConstructorsTest() {
        a = b = 0;
        print();
    }
    ConstructorsTest(int a) {
        this.a = a;
        b = 0;
        print();
    }
    ConstructorsTest(int a, int b) {
        this.a = a;
        this.b = b;
        print();
    }

    private void print () {
        IO.println(a + " " + b);
    }
}