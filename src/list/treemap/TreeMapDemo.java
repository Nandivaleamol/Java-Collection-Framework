package list.treemap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        m.put(104,106);
        //m.put("FFF","XXX"); //ClassCastException
        //m.put(null,"XXX"); //NullPointerException
        System.out.println(m); // {100=ZZZ, 101=XXX, 103=YYY, 104=106}
    }
}
