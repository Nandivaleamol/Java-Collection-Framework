package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBinarySearchDefaultSorting {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("M");
        l.add("A");
        l.add("L");
        l.add("a");

        System.out.println(l); // [Z, M, A, L, a]
        Collections.sort(l);
        System.out.println(l); // [A, L, M, Z, a]
        System.out.println(Collections.binarySearch(l,"Z")); // 3 --> object index
        System.out.println(Collections.binarySearch(l,"J")); // -2 --> object insertion point
    }
}
