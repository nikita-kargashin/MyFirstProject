package lr9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Task7 {
    static void main() {
        ArrayList<Element> aList = new ArrayList<>();
        for (int i = 0; i < 10; aList.add(new Element()), aList.get(i).n = i++);

        LinkedList<Element> lList = new LinkedList<>(aList);

        removeElements(aList);
        removeElements(lList);

        aList.forEach(new Consumer<Element>() {
            @Override
            public void accept(Element e) {
                System.out.println(e.n);
            }
        });

        aList.forEach(e -> System.out.println(e.n));

        for (Element e : aList) System.out.println(e.n);
        for (Element e : lList) System.out.println(e.n);
    }

    static class Element { public int n; }

    static void removeElements (ArrayList<Element> list) {
        for (int i = 1; list.size() > 1;list.remove(i++)) if (i >= list.size()) i -= list.size();
    }

    static void removeElements(LinkedList<Element> list) {
        for (int i = 0; list.size() > 1;) {
            for (Iterator<Element> iterator = list.iterator(); iterator.hasNext(); ) {
                iterator.next();
                if ((++i & 1) == 0) iterator.remove();
            }
        }
    }
}
