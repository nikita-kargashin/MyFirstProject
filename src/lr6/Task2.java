package lr6;

public class Task2 {
    static void main() {
        ClassWithStaticField.printI();
        ClassWithStaticField.printI();
        ClassWithStaticField.printI();
    }
}

class ClassWithStaticField {
    private static int i = 0;
    static void printI() { System.out.println(i++); }
}