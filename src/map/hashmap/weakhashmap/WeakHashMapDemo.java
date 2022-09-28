package map.hashmap.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
    @Override
    public String toString(){
        return "temp";
    }
    @Override
    public void finalize(){
        System.out.println("Finalize method called");
    }
}

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
//        HashMap m = new HashMap();\
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t,"Amol");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}
