package lr9;

public class Task1 {
    static void main() {
        example1(1);
        System.out.println();

        example2(1);
        System.out.println();

        example3(1);
        System.out.println();

        System.out.println(example4(5) + "\n");

        System.out.println("\n" + example5(20));
    }

    private static void example1(int x) {
        System.out.println(x);
        x = 2 * x + 1;
        if (x < 0 || x >= 20) return;
        example1(x);
    }

    private static void example2(int x) {
        int tmp = 2 * x + 1;
        if (tmp >= 0 && tmp <= 20) example2(tmp);
        System.out.println(x);
    }


    private static void example3(int x) {
        example3Space();
        System.out.println(x + " ->");
        example3Step++;
        int temp = 2 * x + 1;
        if (temp >= 0 && temp < 20) example3(temp);
        example3Step--;
        example3Space();
        System.out.println(x + " <-");
    }
    private static int example3Step = 1;
    private static void example3Space() { for (int i = 0; i < example3Step; i++) System.out.print(" "); }

    private static int example4(int x) {
        if (x == 1) return x;
        return x * example4(x - 1);
    }

    private static int example5(int x) {
        System.out.print(x + " ");
        if (x == 0 || x == 1) return x;
        return example5(x - 1) + example5(x - 2);
    }
}