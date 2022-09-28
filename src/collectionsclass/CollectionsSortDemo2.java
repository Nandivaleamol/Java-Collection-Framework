package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("k");
        l.add("L");
        System.out.println("Before sorting : "+l); // [Z, A, k, L]
        Collections.sort(l,new MyComparator());
        System.out.println("After sorting : "+l); // [k, Z, L, A]
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}
