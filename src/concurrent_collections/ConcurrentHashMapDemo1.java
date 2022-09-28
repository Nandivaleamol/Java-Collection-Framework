package concurrent_collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo1 {
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(101,"A");
        m.put(102,"B");
        m.putIfAbsent(103,"C");
        m.putIfAbsent(10,"D");
        m.remove(101);
        m.replace(102,"B","E");
        System.out.println(m); // {102=E, 103=C, 10=D}
    }
}
