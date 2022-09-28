package concurrent_collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread{
    static ConcurrentHashMap m = new ConcurrentHashMap();

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Child Thread updating Map");
        m.put(103,"C");
    }

    public static void main(String[] args) throws InterruptedException {

        m.put(101,"A");
        m.put(102,"B");
        ConcurrentHashMapDemo2 t = new ConcurrentHashMapDemo2();
        t.start();

        Set s1 = m.keySet();
        Iterator itr = s1.iterator();

        while(itr.hasNext()){
            Integer i1 = (Integer) itr.next();
            System.out.println("Main Thread Iterating Map and Current Entry is : "+i1 +"..."+m.get(i1));
            Thread.sleep(2000);
        }
        System.out.println(m);
        /* output:
           Main Thread Iterating Map and Current Entry is : 101...A
            Child Thread updating Map
            Main Thread Iterating Map and Current Entry is : 102...B
            Main Thread Iterating Map and Current Entry is : 103...C
            {101=A, 102=B, 103=C}
         */
    }
}
