package methodoverriding;

class Parent1{

    // var-arg method...
    public void m1(int... i){
        System.out.println("Var-arg Parent method");
    }
}
class Child1 extends Parent1{

    // here m1()is not override method because it is normal method...
    public void m1(int i){
        System.out.println("Child method");
    }

    // var-arg method...
    @Override
    public void m1(int... i){
        System.out.println("Var-arg child method");
    }
}

public class VarArgMethods {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.m1(10);

        Child1 c1 = new Child1();
        c1.m1(18);

        Parent1 pc = new Child1(); // JVM compile Parent reference object and executes RunTime object (child object).
        pc.m1(19);
    }
}
