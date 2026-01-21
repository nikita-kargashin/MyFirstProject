package lr7;

public class Task3 {
    static void main() {
        System.out.println(new ExtendedClass3(1, 'a', "bcd").toString());
    }
}

class SuperClass3 {
    public int i;

    SuperClass3(int i) { this.i = i; }

    void setValue (int i) { this.i = i; }

    @Override
    public String toString() { return getClass().getSimpleName() + " " + i; }
}

class SuperExtendedClass extends SuperClass3 {
    public char ch;

    SuperExtendedClass (int i, char ch) {
        super(i);
        this.ch = ch;
    }

    void setValue (int i, char ch) {
        setValue(i);
        this.ch = ch;
    }

    @Override
    public String toString() { return super.toString() + " " + ch;}
}

class ExtendedClass3 extends SuperExtendedClass {
    public String str;

    ExtendedClass3 (int i, char ch, String str) {
        super(i, ch);
        this.str = str;
    }

    void setValue (int i, char ch, String str) {
        setValue(i, ch);
        this.str = str;
    }

    @Override
    public String toString() { return super.toString() + " " + str;}
}