package binarytree;

import java.util.*;

public class BinarySearchTree<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> root = null;
    private int size = 0;

    private static class Node<E> {
        E value;
        Node<E> left, right;

        private Node(E value) { this(value, null, null); }
        private Node(E value, Node<E> left, Node<E> right) {
            if (value == null) throw new NullPointerException();
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public boolean insert(T value) {
        boolean inserted = true;
        if (root == null) root = new Node<>(value);
        else inserted = insert(value, root);
        if (inserted) size++;
        return inserted;
    }
    private boolean insert(T value, Node<T> node) {
        int cmp = value.compareTo(node.value);
        if (cmp == 0) return false;
        if (cmp < 0) {
            if (node.left == null) {
                node.left = new Node<>(value);
                return true;
            }
            return insert(value, node.left);
        } else {
            if (node.right == null) {
                node.right = new Node<>(value);
                return true;
            }
            return insert(value, node.right);
        }
    }

    public boolean contains(T value) { return contains(value, root); }
    private boolean contains(T value, Node<T> node) {
        if (node == null) return false;
        int cmp = value.compareTo(node.value);
        if (cmp < 0) return contains(value, node.left);
        if (cmp > 0) return contains(value, node.right);
        return true;
    }

    public boolean isEmpty() { return root == null; }

    public int getSize() { return size; }

    public int getHeight() { return getHeight(root, 0); }
    private int getHeight(Node<T> node, int h) {
        if (node == null) return h;
        return Math.max(getHeight(node.left, h + 1), getHeight(node.right, h + 1));
    }

    private boolean removed;
    public boolean remove(T value) {
        removed = false;
        root = remove(value, root);
        if (removed) size--;
        return removed;
    }
    private Node<T> remove (T value, Node<T> node) {
        if (node == null) return null;
        int cmp = value.compareTo(node.value);

        if (cmp < 0) node.left = remove(value, node.left);
        else if (cmp > 0) node.right = remove(value, node.right);
        else {
            removed = true;
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node<T> tmpNode = node.left;
            while (tmpNode.right != null) tmpNode = tmpNode.right;
            node.value = tmpNode.value;
            node.left = remove(node.value, node.left);
        }
        return node;
    }

    @Override
    public Iterator<T> iterator() {
        Node<T> node = root;
        Deque<Node<T>> stack = new ArrayDeque<>();
        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        return new Iterator<>() {
            @Override
            public boolean hasNext() { return !stack.isEmpty(); }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                Node<T> nextNode = stack.pop();
                Node<T> tmpNode = nextNode.right;
                while (tmpNode != null) {
                    stack.push(tmpNode);
                    tmpNode = tmpNode.left;
                }
                return nextNode.value;
            }
        };
    }
}
