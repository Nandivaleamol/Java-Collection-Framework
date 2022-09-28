package methodoverloading;

public class Test1 {

    public void m1(){
        System.out.println("No-args method...");
    }
    public void m1(int i){
        System.out.println("int arg method...");
        System.out.println(i);
    }
    public void m1(long l){
        System.out.println("long arg method...");
    }
    public void m1(float f){
        System.out.println("float arg method...");
    }
    public void m1(double d){
        System.out.println("double arg method...");
    }
    public void m1(String s){
        System.out.println("String arg method...");
    }
    public void m1(Object o){
        System.out.println("Object arg method...");
    }
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer arg method...");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        t1.m1();
        t1.m1(10);
        t1.m1(10L);  // here we can call int and long overloading method using L or l key we call long type overloading method. eg. m1(10l) or m1(10L)
        t1.m1(10.5f);
        t1.m1(10.8);
        t1.m1('a');  // it gets ASCII value of 'a'....


        t1.m1("String");
        t1.m1(new Object());
        t1.m1(new StringBuffer("Amol"));

       // t1.m1(null); // here compiler give you left and right because null value is accepted both String and StringBuffer Object also..
                        // but here comepiler confused to who's give chance to this null value that's why compiler gives compile time error..

    }
}
