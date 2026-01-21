package lr7;

public class Task4 {
    static void main() {
    }
}

class SuperClass4 {
    public char ch;

    SuperClass4(char ch) { this.ch = ch; }
    SuperClass4(SuperClass4 obj) { this(obj.ch); }
}

class SuperExtendedClass4 extends SuperClass4 {
    public String str;

    SuperExtendedClass4(char ch, String str) {
        super(ch);
        this.str = str;
    }
    SuperExtendedClass4(SuperExtendedClass4 obj) { this(obj.ch, obj.str );
    }
}

class ExtendedClass4 extends SuperExtendedClass4 {
    public int i;

    ExtendedClass4(char ch, String str, int i) {
        super(ch, str);
        this.i = i;
    }
    ExtendedClass4(ExtendedClass4 obj) { this(obj.ch, obj.str, obj.i); }
}