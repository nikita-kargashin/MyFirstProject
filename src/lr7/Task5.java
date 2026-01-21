package lr7;

public class Task5 {
    static void main(String[] args) {
        SuperClass5 test = new SuperClass5("qwe");
        test.printValue();
        test = new ExtendedClass5One("qwe", 1);
        test.printValue();
        test = new ExtendedClass5Two("qwe", 'a');
        test.printValue();
    }
}

class SuperClass5 {
    private String str;

    SuperClass5(String str) { this.str = str; }

    void printValue() { printValue(null); }
    void printValue(String str) {
        System.out.println(getClass().getSimpleName() + " " + this.str + ((str == null) ? "" : " " + str));
    }
}

class ExtendedClass5One extends SuperClass5 {
    protected int i;

    ExtendedClass5One (String str, int i) {
        super(str);
        this.i = i;
    }

    @Override
    void printValue() { super.printValue(Integer.toString(i)); }
}

class ExtendedClass5Two extends SuperClass5 {
    protected char ch;

    ExtendedClass5Two (String str, char ch) {
        super(str);
        this.ch = ch;
    }

    @Override
    void printValue() { super.printValue(Character.toString(ch)); }
}