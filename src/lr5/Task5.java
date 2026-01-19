package lr5;

class Task5 {
    static void main() {
        MethodOverloadingTest test = new MethodOverloadingTest();
        test.testOverloading();
        test.testOverloading(50);
        test.testOverloading(150);
    }
}

class MethodOverloadingTest {
    private int i;

    MethodOverloadingTest()      { this(0); }
    MethodOverloadingTest(int i) { this.i = i; }

    void testOverloading()      { testOverloading(0);}
    void testOverloading(int i) { this.i = Math.min(i, 100); testMethod();};

    private void testMethod() { IO.println(i); }
}