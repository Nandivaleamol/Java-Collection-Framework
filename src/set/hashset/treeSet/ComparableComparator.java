package set.hashset.treeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparator{
    public static void main(String[] args) {
        Employee e1 = new Employee("Amol",100);
        Employee e2 = new Employee("Ankuli",200);
        Employee e3 = new Employee("Vijay", 50);
        Employee e4 = new Employee("Chiru", 150);
        Employee e5 = new Employee("Ankuli",100);

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t); // sorting natural sorting by id...
        // [Vijay - 50, Amol - 100, Chiru - 150, Ankuli - 200]

        TreeSet t1 = new TreeSet(new MyComparator2());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1); // Custom sorting by using Comparator interface... sorting by name...
        // [Amol - 100, Ankuli - 200, Chiru - 150, Vijay - 50]

    }
}

class Employee implements Comparable{
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        return name +" - "+id;
    }

    @Override
    public int compareTo(Object o) {

        int  id1 = this.id;
        Employee e = (Employee) o;
        int id2 = e.id;

        if (id1<id2){
            return -1;
        }else if (id1>id2){
            return 1;
        }else{
            return 0;
        }
    }
}
class MyComparator2 implements Comparator{
    public int compare(Object obj1, Object obj2){
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;

        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}