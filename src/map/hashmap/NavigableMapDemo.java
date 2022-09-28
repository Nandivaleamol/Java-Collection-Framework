package map.hashmap;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> t = new TreeMap<String, String>();
        t.put("b","bananna");
        t.put("a", "apple");
        t.put("d","dog");
        t.put("c","cat");
        t.put("g","gun");

        System.out.println(t); // {a=apple, b=bananna, c=cat, d=dog, g=gun}
        System.out.println(t.ceilingEntry("c")); // c=cat
        System.out.println(t.lowerEntry("c"));  // b=bananna
        System.out.println(t.higherEntry("c")); // d=dog
        System.out.println(t.higherKey("c")); // d
        System.out.println(t.pollFirstEntry()); // a=apple
        System.out.println(t.pollLastEntry()); // g=gun
        System.out.println(t.descendingKeySet()); // [d, c, b]
        System.out.println(t); // {b=bananna, c=cat, d=dog}
    }
}
