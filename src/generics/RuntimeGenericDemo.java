package generics;

import java.util.ArrayList;

public class RuntimeGenericDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<String>();
        l.add("Amol");
        l.add(18);
        l.add(true);
        l.add(22.8);
        System.out.println(l); // [Amol, 18, true, 22.8]
    }
}
