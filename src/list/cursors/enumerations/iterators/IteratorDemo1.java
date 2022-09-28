package list.cursors.enumerations.iterators;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        for (int i=0; i<=10; i++){
            l.add(i);
        }
        System.out.println(l);  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Iterator itr = l.iterator();
        while (itr.hasNext()){
            Integer i = (Integer) itr.next();

            // i want to only print even number and odd number remove from Arraylist...
            if (i%2==0){
                System.out.println(i);  // 0 2 4 6 8 10
            }else{
                itr.remove();
            }
        }
        System.out.println(l);  // [0, 2, 4, 6, 8, 10]
    }
}
