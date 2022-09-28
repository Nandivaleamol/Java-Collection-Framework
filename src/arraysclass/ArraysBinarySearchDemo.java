package arraysclass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearchDemo {
    public static void main(String[] args) {
        int [] a = {10,5,20,18,7,19};
        Arrays.sort(a); // sort by natural order
        System.out.println(Arrays.binarySearch(a,10)); // 2
        System.out.println(Arrays.binarySearch(a,18)); // 3

        String [] s = {"A", "Z", "B"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"Z")); // 2
        System.out.println(Arrays.binarySearch(s,"S")); // -3

        Arrays.sort(s, new MyComparator1());
        System.out.println(Arrays.binarySearch(s,"Z",new MyComparator1())); // 0
        System.out.println(Arrays.binarySearch(s, "S", new MyComparator1())); // -2
        System.out.println(Arrays.binarySearch(s,"N")); // -4

    }
}
class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = o1.toString();
        String obj2 = o2.toString();
        return obj2.compareTo(obj1);
    }
}
