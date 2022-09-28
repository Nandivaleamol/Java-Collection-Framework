package concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread01 extends Thread {

    static ArrayList l = new ArrayList();
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread updating List");
        l.add("D");
    }
    public static void main(String[] args) throws InterruptedException{
        l.add("A");
        l.add("B");
        l.add("C");
        MyThread01 t = new MyThread01();
        t.start();
        Iterator itr = l.iterator();
        while (itr.hasNext()){
            String s1 = (String) itr.next();
            System.out.println("Main Thread Iterating List and Current Object is : "+s1);
            Thread.sleep(2000);
        }
        System.out.println(l);

    }
}
