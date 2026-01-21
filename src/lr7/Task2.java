package lr7;

public class Task2 {
    static void main() {

    }
}

class SuperClass2 {
    private String str;
    void setValue(String str) { this.str = str; }
    SuperClass2(String str) { this.str = str;}
    int getStrL() { return str.length(); }
}

class ExtendedClass2 extends SuperClass2 {
    public int i;
    ExtendedClass2 (String str, int i) {
        super(str);
        this.i = i;
    }

    @Override
    void setValue(String str) { super.setValue(str); }

    void setValue() {}
    void setValue(int i, String str) {
        setValue(i);
        setValue(str);
    }
    void setValue(int i) { this.i = i; }
}