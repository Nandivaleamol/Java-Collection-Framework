package generics;

import java.util.ArrayList;

public class GenricMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Amol");
        l.add("Anmol");
        l.add("Anuj");
        //l.add(18); // CE: java: incompatible types: int cannot be converted to java.lang.String
        m1(l);
        System.out.println(l); // [Amol, Anmol, Anuj, 10, true, false, 18]
    }

    public static void m1(ArrayList l){
        l.add(10);
        l.add(true);
        l.add(false);
        l.add(18);
    }
}
