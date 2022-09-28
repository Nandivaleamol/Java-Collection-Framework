package set.hashset.treeSet;
import java.util.TreeSet;
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));

        System.out.println(t);
    }
}
