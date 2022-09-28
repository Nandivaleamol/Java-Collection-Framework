package inhetitance;

class A{
    public void m1(){
        System.out.println("m1() parent method");
    }
    private void m2(){
        System.out.println("m2() private method");
    }
}
class B extends A{
    @Override
    public void m1(){
        System.out.println("m1() override method");
    }
//    @Override
//    private void m2(){ // child class can't access parent private methods...
//
//    }
}

public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        //a.m2();  // we can't call private method of other class...

        B b = new B();
        b.m1();
    }
}
