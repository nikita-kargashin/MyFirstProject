package lr7;

public class Task1 {
    static void main() {
        System.out.println(new SuperClass("abc").toString());
    }
}

class SuperClass {
    private String str;

    SuperClass(String str) { this.str = str; }

    @Override
    public String toString() { return (getClass().getSimpleName() + " " + str); }
}

class ExtendedClass extends SuperClass {
    private String str;

    ExtendedClass(String str) { super(str); }
    ExtendedClass(String str1, String str2) {
        super(str1);
        this.str = str2;
    }

    @Override
    public String toString() { return super.toString() + ((str != null) ? " " + str : ""); }
}