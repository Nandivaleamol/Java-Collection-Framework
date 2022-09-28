package arraysclass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int [] a = {10, 18, 21, 19, 9};
        System.out.println("Primitive Array before sorting:");
        for (int a1 : a){
            System.out.println(a1); // 10 18 21 19 9
        }
        Arrays.sort(a);
        System.out.println("Primitive Array After sorting:");
        for (int a1 : a){
            System.out.println(a1); // 9 10 18 19 21
        }

        // String sorting
        String [] s = {"A", "Z", "B"};
        System.out.println("Object Array Before Sorting: ");
        for (String s1 : s){
            System.out.println(s1); // A Z B
        }
        System.out.println("Object Array After Sorting:");
        Arrays.sort(s);
        for (String s1 : s){
            System.out.println(s1); // A B Z
        }
        System.out.println("Customized Sorting:");
        Arrays.sort(s,new MyComparator());
        for (String s1 : s){
            System.out.println(s1); // Z B A
        }
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = (String) o1;
        String obj2 = (String) o2;
        return obj2.compareTo(obj1);
    }
}
