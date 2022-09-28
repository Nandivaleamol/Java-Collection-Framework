package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(5);
        l.add(10);
        l.add(11);
        l.add(18);
        l.add(7);
        System.out.println(l); // [5, 10, 11, 18, 7]
        Collections.reverse(l);
        System.out.println(l); // [7, 18, 11, 10, 5]
    }
}
