package generics;

public class GenericDemo {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<String>("amol");
        g1.show(); // The type of ob: java.lang.String
        System.out.println(g1.getOb()); // amol

        Gen<Integer> g2 = new Gen<Integer>(10);
        g2.show(); // The type of ob: java.lang.Integer
        System.out.println(g2.getOb()); // 10

        Gen<Double> g3 = new Gen<>(10.5);
        g3.show(); // The type of ob: java.lang.Double
        System.out.println(g3.getOb()); // 10.5
    }
}

class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob = ob;
    }
    public void show(){
        System.out.println("The type of ob: "+ob.getClass().getName());
    }
    public T getOb(){
        return ob;
    }
}
