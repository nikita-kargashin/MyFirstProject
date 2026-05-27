package lr9;

import java.util.NoSuchElementException;

public class Task8 {
    static void main() {
        LList<Integer> list = new LList<>();

        list.createHead(new Integer[]{1, 2, 3});
        System.out.println("\ncreateHead(new Integer[]{1, 2, 3})\n" + list);

        list.createTail(new Integer[]{4, 5, 6});
        System.out.println("\ncreateTail(new Integer[]{4, 5, 6})\n" + list);

        list.addFirst(0);
        System.out.println("\naddFirst(0)\n" + list);

        list.addLast(8);
        System.out.println("\naddLast(8)\n" + list);

        list.insert(7, 7);
        System.out.println( "\ninsert(7, 7)\n" + list);

        list.remove();
        System.out.println("\nremove()\n" + list);

        list.createHeadRec(new Integer[]{1, 2, 3});
        System.out.println("\ncreateHeadRec(new Integer[]{1, 2, 3})\n" + list.toStringRec());

        list.createTailRec(new Integer[]{4, 5, 6});
        System.out.println("\ncreateTailRec(new Integer[]{4, 5, 6})\n" + list.toStringRec());
    }

    private static class LList<T> {
        private static class Node<T> {
            private T value;
            private Node<T> next;

            Node(T value, Node<T> next) {
                this.value = value;
                this.next = next;
            }
        }


        private Node<T> head = null;


        private Node<T> getNode(int index) {
            if (index < 0 ) throw new IllegalArgumentException();
            if (head == null) throw new NoSuchElementException();

            Node<T> node = head;
            for (int i = 0; i < index; i++) {
                if (node.next == null) throw new NoSuchElementException();
                node = node.next;
            }

            return node;
        }

        private void removeNextNode(Node<T> node) {
            if (node.next == null) throw new NoSuchElementException();

            Node<T> removingNode = node.next;
            node.next = removingNode.next;

            removingNode.next = null;
            removingNode.value = null;
        }

        private void checkArray(T[] arr) { if (arr == null || arr.length == 0) throw new IllegalArgumentException(); }


        @Override
        public String toString() {
            if (head == null) return "[]";

            Node<T> node = head;
            StringBuilder string = new StringBuilder("[");

            while (node.next != null) {
                string.append(node.value).append(", ");
                node = node.next;
            }
            string.append(node.value).append("]");

            return string.toString();
        }


        public void createHead(T[] values) {
            checkArray(values);
            for (int i = values.length; i > 0;) addFirst(values[--i]);
        }

        public void createTail(T[] values) {
            checkArray(values);
            for (T value : values) addLast(value);
        }

        public void addFirst(T value) { insert(0, value); }

        public void addLast(T value) {
            if (head == null) {
                addFirst(value);
                return;
            }

            Node<T> node = head;
            while (node.next != null) node = node.next;
            node.next = new Node<>(value, null);
        }

        public void insert(int index, T value) {
            if (index == 0) {
                head = new Node<>(value, head);
                return;
            }

            Node<T> node = getNode(index - 1);
            node.next = new Node<>(value, node.next);
        }


        public void removeFirst() { removeAt(0); }

        public void removeLast() {
            Node<T> node = getNode(0);
            if (node.next == null) {
                removeAt(0);
                return;
            }

            while (node.next.next != null) node = node.next;
            removeNextNode(node);
        }

        public void removeAt(int index) {
            if (index == 0) {
                Node<T> node = getNode(0);
                head = head.next;
                node.next = null;
                node.value = null;
                return;
            }

            removeNextNode(getNode(index - 1));
        }

        public void remove() { while (head != null) removeFirst(); }


        public void createHeadRec(T[] values) {
            checkArray(values);
            head = createHeadRec(values, 0);
        }
        private Node<T> createHeadRec(T[] values, int i) {
            if (i == values.length - 1) return new Node<>(values[i], head);
            return new Node<>(values[i], createHeadRec(values, i + 1));
        }

        private void createTailRec(T[] values) {
            checkArray(values);
            createTailRec(values, head);
        }
        private void createTailRec(T[] values, Node<T> node) {
            if (head == null) {
                head = createTailRec(values, values.length);
                return;
            }
            if (node.next == null) {
                node.next = createTailRec(values, values.length);
                return;
            }
            createTailRec(values, node.next);
        }
        private Node<T> createTailRec(T[] values, int i) {
            if (i == 1) return new Node<>(values[values.length - i], null);
            return new Node<>(values[values.length - i], createTailRec(values, i - 1));
        }

        public String toStringRec() {
            if (head == null) return "[]";

            StringBuilder string = new StringBuilder("[");
            toStringRec(string, head);
            string.append("]");

            return string.toString();
        }
        private void toStringRec(StringBuilder string, Node<T> node) {
            string.append(node.value);
            if (node.next == null) return;
            toStringRec(string.append(", "), node.next);
        }
    }
}
