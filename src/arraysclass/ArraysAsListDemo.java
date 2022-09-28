package arraysclass;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String [] s = {"A","Z","B"};
        List l = Arrays.asList(s);
        System.out.println(l); // [A, Z, B]
        s[0] = "K";
        for (String s1 : s){
            System.out.println(s1); // K Z B
        }
        //l.add("Amol"); // UnsupportedOperationException
       // l.remove(2); // UnsupportedOperationException
       // l.set(1,new Integer(10)); // ArrayStoreException
    }
}
