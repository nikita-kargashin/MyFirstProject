package lr9;

import java.util.*;

public class TestDataStructure {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> sortedSet = new TreeSet<>() {};
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Время выполнения операции добавления в hashSet = " + getRunningTime(hashSet, 0));
        System.out.println("Время выполнения операции удаления из hashSet = " + getRunningTime(hashSet, 1));
        System.out.println();
        System.out.println("Время выполнения операции добавления в sortedSet = " + getRunningTime(sortedSet, 0));
        System.out.println("Время выполнения операции удаления из sortedSet = " + getRunningTime(sortedSet, 1));
        System.out.println();
        System.out.println();
        System.out.println("Время выполнения операции добавления в начало arrayList = " + getRunningTime(arrayList, 0));
        System.out.println("Время выполнения операции добавления в середину arrayList = " + getRunningTime(arrayList, 1));
        System.out.println("Время выполнения операции добавления в конец arrayList = " + getRunningTime(arrayList, 2));
        System.out.println();
        System.out.println("Время выполнения операции удаления в начале arrayList = " + getRunningTime(arrayList, 3));
        System.out.println("Время выполнения операции удаления в середине arrayList = " + getRunningTime(arrayList, 4));
        System.out.println("Время выполнения операции удаления в конце arrayList = " + getRunningTime(arrayList, 5));
        System.out.println();
        System.out.println("Время выполнения операции получения элемента в начале arrayList = " + getRunningTime(arrayList, 6));
        System.out.println("Время выполнения операции получения элемента в середине arrayList = " + getRunningTime(arrayList, 7));
        System.out.println("Время выполнения операции получения элемента в конце arrayList = " + getRunningTime(arrayList, 8));



    }

    private static long getRunningTime(Set<Integer> set, int mode){
        if (mode == 1) for (int i = 0; i < 100000; i++) set.add(i);
        long start = System.currentTimeMillis();
        if(mode == 0) for (int i = 0; i < 100000; i++) set.add(i);
        if(mode == 1) for (int i = 0; i < 100000; i++) set.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTime(List<Integer> list, int mode){
        if (mode > 2) for (int i = 0; i < 100000; i++) list.add(i);
        long start = System.currentTimeMillis();

        if (mode == 0) for (int i = 0; i < 100000; i++) list.addFirst(i);
        if (mode == 1) for (int i = 0; i < 100000; i++) list.add(list.size()/2, i);
        if (mode == 2) for (int i = 0; i < 100000; i++) list.add(i);

        if (mode == 3) for (int i = 0; i < 100000; i++) list.removeFirst();
        if (mode == 4) for (int i = 0; i < 100000; i++) list.remove(list.size()/2);
        if (mode == 5) for (int i = 0; i < 100000; i++) list.addLast(list.size() - 1);

        if (mode == 6) for (int i = 0; i < 100000; i++) list.getFirst();
        if (mode == 7) for (int i = 0; i < 100000; i++) list.get(list.size()/2);
        if (mode == 8) for (int i = 0; i < 100000; i++) list.getLast();

        long end = System.currentTimeMillis();
        return end - start;
    }
}