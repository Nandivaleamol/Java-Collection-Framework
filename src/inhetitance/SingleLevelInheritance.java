package inhetitance;

import org.w3c.dom.ls.LSOutput;

class AA {
    int rollNo;
    String name;
    String city;

    public void display(){
        System.out.println("Parent class AA");
    }

}
class BB extends AA{
    @Override
    public void display() {
        super.display();
        System.out.println("Child class BB");
    }
}
class CC extends BB{
    @Override
    public void display() {
        System.out.println("Sub Child class CC");
    }
}
class DD extends CC{
    @Override
    public void display() {
        System.out.println("Sub sub Child class DD");
        super.display();  // super keyword is used for parent class reference...
    }
}
class EE extends DD{
    @Override
    public void display() {
        System.out.println("Sub Sub Sub Child class EE");
    }
}

public class SingleLevelInheritance {

    public static void main(String[] args) {

        AA aa = new AA();
        aa.display();

        BB bb = new BB();
        bb.display();

        CC cc = new CC();
        cc.display();

        DD dd = new DD();
        dd.display();

        EE ee = new EE();
        ee.display();

        AA ae = new EE();

    }
}
