package set.hashset.treeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);  // [20, 15, 10, 5, 0]
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        Integer l1 = (Integer) obj1;
        Integer l2 = (Integer) obj2;
        if (l1<l2)
            return +1;
        else if (l1>l2)
            return -1;
        else
            return 0;
    }
}
