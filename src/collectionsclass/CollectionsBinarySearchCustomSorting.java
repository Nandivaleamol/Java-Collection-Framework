package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsBinarySearchCustomSorting {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(18);
        l.add(10);
        l.add(19);
        l.add(99);
        l.add(3);
        l.add(9);
        l.add(20);
        l.add(1);
        System.out.println(l); // [18, 10, 19, 99, 3, 9, 20, 1]
        Collections.sort(l,new MyComparator1());
        System.out.println(l); // [99, 20, 19, 18, 10, 9, 3, 1]

        System.out.println(Collections.binarySearch(l,99,new MyComparator1())); // 3
        System.out.println(Collections.binarySearch(l,03,new MyComparator1())); // 6
        System.out.println(Collections.binarySearch(l,21,new MyComparator1())); // -2
        System.out.println(Collections.binarySearch(l,15)); // -1

        System.out.println(l); // [18, 10, 19, 99, 3, 9, 20, 1]
    }
}

class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer obj1 = (Integer) o1;
        Integer obj2 = (Integer) o2;
        return obj2.compareTo(obj1);
    }
}