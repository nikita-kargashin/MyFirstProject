package lr5;

class Task4 {
    static void main() {
       new ConstructorsTest2('a', 2);
       new ConstructorsTest2((double) 'b' + 0.12345);
    }
}

class ConstructorsTest2 {
    private char ch;
    private int i;

    ConstructorsTest2(char ch, int i) {
        this.ch = ch;
        this.i = i;
        print();
    }
    ConstructorsTest2(double d) {
        ch = (char) d;
        i = Integer.parseInt(String.valueOf(d).split("\\.")[1]);
        print();
    }

    void print() {
        IO.println(ch + " " + i);
    }
}