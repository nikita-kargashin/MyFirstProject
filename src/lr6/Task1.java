package lr6;

public class Task1 {
    static void main() {
        CharOrString test = new CharOrString();
        test.setChOrSt('a');
        System.out.println(test.ch + " " + test.st);
        test.setChOrSt("sadf");
        System.out.println(test.ch + " " + test.st);
        char[] ch = {'a', 'b', 'c'};
        test.setChOrSt(ch);
        System.out.println(test.ch + " " + test.st);
    }
}

class CharOrString {
    char ch;
    String st;

    public void setChOrSt(char ch) {
        this.ch = ch;
    }
    public void setChOrSt(String st) {
        this.st = st;
    }
    public void setChOrSt(char[] chArr) {
        if (chArr.length == 1) ch = chArr[0];
        else st = new String(chArr);
    }
}