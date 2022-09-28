package list.cursors.enumerations;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {

        Vector v = new Vector();
        for (int i=1; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v);  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            // getting only even numbers
            if (i%2==0){
                System.out.println(i); // 2 4 6 8 1 0
            }
        }
        System.out.println(v);  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
