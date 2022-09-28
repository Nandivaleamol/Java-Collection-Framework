package collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsSortDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
//        l.add(new Integer(10)); // if adding heterogeneous object: throws- ClassCastException
//        l.add(null);  // only sorting case throws - NullPointerException

        System.out.println("Before sorting: "+ l); // [Z, A, K, N, 10, null]
        Collections.sort(l);
        System.out.println("After Sorting: "+l); // [A, K, N, Z]
    }
}