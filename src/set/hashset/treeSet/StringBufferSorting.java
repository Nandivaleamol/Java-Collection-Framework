package set.hashset.treeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferSorting {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComaparator2());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);  // [A, K, L, Z]
    }
}
class MyComaparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = o1.toString();
        String obj2 = o2.toString();
        return obj1.compareTo(obj2);
    }
}