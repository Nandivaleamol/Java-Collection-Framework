package list.arraylist;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add(10);
        list.add("A");
        list.add(null);

        System.out.println(list);  // [A, 10, A, null]

        list.remove(2);
        System.out.println(list);  // [A, 10, null]

        list.add(2,"M");
        list.add("N");
        System.out.println(list);  // [A, 10, M, null, N]
    }
}
