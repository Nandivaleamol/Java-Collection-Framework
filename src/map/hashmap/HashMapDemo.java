package map.hashmap;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Amol", 700);
        m.put("Balaiah", 800);
        m.put("Venkatesh", 200);
        m.put("Nagarjuna", 500);
        m.put("Ankuli",700);
        System.out.println(m); // {Amol=700, Balaiah=800, Venkatesh=200, Nagarjuna=500, Ankuli=700}
        System.out.println(m.put("Amol",10000)); //{Amol=700, Balaiah=800, Venkatesh=200, Nagarjuna=500, Ankuli=700} 700

        Set s= m.keySet();
        System.out.println(s); // [Amol, Balaiah, Venkatesh, Nagarjuna, Ankuli]

        Collection c = m.values();
        System.out.println(c); // [10000, 800, 200, 500, 700]

        Set s1 = m.entrySet();
        System.out.println(s1); // [Amol=10000, Balaiah=800, Venkatesh=200, Nagarjuna=500, Ankuli=700]

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + " -----> "+m1.getValue());
            /* output:
                Amol -----> 10000
                Balaiah -----> 800
                Venkatesh -----> 200
                Nagarjuna -----> 500
                Ankuli -----> 700
             */
            if (m1.getKey().equals("Amol")){
                m1.setValue(10000);
            }
        }
        System.out.println(m); // {Amol=10000, Balaiah=800, Venkatesh=200, Nagarjuna=500, Ankuli=700}

    }
}
