package lr5;

class Task1 {
    static void main() {
        TestClass test = new TestClass();

        test.setValue(IO.readln("Введите символ: ").toCharArray()[0]);
        IO.println("Символ" + test.getValue());
        IO.println("Код" + test.getCode());


    }
}

class TestClass {
    private char ch;

    void setValue(char ch) {
        this.ch = ch;
    }

    char getValue() {
        return ch;
    }

    int getCode() {
        return (int) ch;
    }
}