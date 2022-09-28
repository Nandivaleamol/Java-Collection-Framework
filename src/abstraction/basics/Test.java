package abstraction.basics;

abstract class Parent {

    // creating static block inside abstract class
    // its calls whenever we create child class object or Parent class object(Some ways to create abstract class object...)
    static {
        System.out.println("I am static block in abstract class...");
        int a = 18;
        int b = 10;
        System.out.println("Sum of a and b : " + (a + b));
    }

    // creating variables inside abstract class...
    int age = 23;
    String name = "Amol";

    Parent() {
        System.out.println("I am abstract class constructor...");
    }

    // static method inside abstract method...
    static void m3() {
        System.out.println("I am static m3() inside abstract class...");
    }

    // creating abstract methods...
    public abstract void m1();
//    private abstract void m3();  // throws error: Illegal combination of modifiers: 'abstract' and 'private'

    abstract public void m2();

    protected abstract int m2(int i);

    // we can't create default method in abstract class...

    // creating non-abstract method...
    public void display() {
        System.out.println("Good morning, this display() method in abstract class");
    }
}

class Child extends Parent {
    @Override
    public void m1() {
        System.out.println(name); // we can access variable of abstract class...
        System.out.println(age);
        System.out.println("I am m1() and my body provides Child class of Parent class");
    }

    @Override
    public void m2() {
        System.out.println("I am m2() and my body provides Child class of Parent class");
    }

    @Override
    protected int m2(int i) {
        return i;
    }

    @Override
    public void display() {
        System.out.println("I am display() and child class override me...");
    }

    // we cannot override static method of abstract class...
//    @Override
//    static void m3(){
//        System.out.println("I am static m3() inside abstract class...");
//    }

}

public class Test {
    public static void main(String[] args) {

//        Parent p = new Parent();  // here we can't create abstract class object
//        Child c2 = new Parent();    // cant create abstract class object...

        Parent p1 = new Child(); // we can create abstract class object by taking child class reference...
        p1.display();
        p1.m1();
        p1.m2();
        p1.m2(5);
        Parent.m3();

        Child c = new Child();
        c.display();
        c.m1();
        c.m2();
        c.m2(18);
        Parent.m3();

        // Some other ways to create abstract class object....
        Parent p2 = new Parent() {
            @Override
            public void m1() {
                System.out.println("I am m1() method and calling from Test class main() method..");
            }

            @Override
            public void m2() {
                System.out.println("I am m2() method and calling from Test class main() method...");
            }

            @Override
            protected int m2(int i) {
                return i;
            }

            @Override
            public void display() {
                System.out.println("I am display() method and calling gives my inside main method...");
            }
        };

        p2.m2();  // no any output...
        p2.m1();  // no any output...
        p2.m2(10); // no any output...
        p2.display(); // output : Good morning, this display() method in abstract class
        Parent.m3();
        Parent.m3();

    }
}
