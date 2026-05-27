package lr9;

public class Task5 {
    static void main() {
        Node head = null;

        // С начала списка
        for (int i = 9; i >= 0; i--) head = new Node (i, head);

        // С конца
        for (Node ref = head; ; ref = ref.next)
            if (ref.next == null) {
                ref.next = new Node(10, null);
                break;
            }

        for (Node ref = head; ref != null; ref = ref.next) System.out.println(ref.value);
    }


    static class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}