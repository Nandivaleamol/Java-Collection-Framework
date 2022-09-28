package set.hashset.treeSet;
import java.util.Comparator;
import java.util.TreeSet;
public class StringReverseSorting {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new MyComparator1());
        t.add("Ankuli");
        t.add("Radha");
        t.add("Anuj");
        t.add("Amol");
        t.add("Rutuja");
        t.add("Vijay");

        System.out.println(t); // [Vijay, Rutuja, Radha, Anuj, Ankuli, Amol]

        // Default sorting- [Amol, Ankuli, Anuj, Radha, Rutuja, Vijay]
    }
}
class MyComparator1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = (String) o1;
        String obj2 = o2.toString();
//        return - obj1.compareTo(obj2);
        return obj2.compareTo(obj1);
    }

}
