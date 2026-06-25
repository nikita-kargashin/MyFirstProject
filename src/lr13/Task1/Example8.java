package lr13.Task1;

public class Example8 {
    public class Main {
        public static int m() {
            try {
                return 0;
//                throw new RuntimeException();
            } finally {
                return 1;
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
