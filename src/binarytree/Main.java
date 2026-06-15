package binarytree;

public class Main {
    static void main() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        System.out.println("- Пустое дерево");
        System.out.println("isEmpty: " + tree.isEmpty());
        System.out.println("size: " + tree.getSize());
        System.out.println("height: " + tree.getHeight());

        System.out.println("\n- Добавление элементов");
        int[] values = {10, 5, 15, 3, 7, 12, 20, 6};

        for (int value : values) System.out.println("insert(" + value + "): " + tree.insert(value));

        System.out.println("\n- Попытка добавить дубликат");
        System.out.println("insert(7): " + tree.insert(7));

        System.out.println("\n- Состояние дерева");
        System.out.println("size: " + tree.getSize());
        System.out.println("height: " + tree.getHeight());
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Проверка contains");
        System.out.println("contains(7): " + tree.contains(7));
        System.out.println("contains(100): " + tree.contains(100));

        System.out.println("\n- Удаление листа");
        System.out.println("remove(3): " + tree.remove(3));
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Удаление узла с одним ребёнком");
        System.out.println("remove(7): " + tree.remove(7));
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Удаление узла с двумя детьми");
        System.out.println("remove(15): " + tree.remove(15));
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Удаление корня");
        System.out.println("remove(10): " + tree.remove(10));
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Удаление несуществующего элемента");
        System.out.println("remove(999): " + tree.remove(999));
        for (int i : tree) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n- Итог");
        System.out.println("isEmpty: " + tree.isEmpty());
        System.out.println("size: " + tree.getSize());
        System.out.println("height: " + tree.getHeight());
    }
}
