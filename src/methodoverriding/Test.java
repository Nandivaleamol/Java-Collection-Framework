package methodoverriding;

class P{
    public void property(){
        System.out.println("Cash + Gold + Land..");
    }
    public void marriage(){
        System.out.println(" Parent method : Appalaamma | Subbalakshmi");
    }
}
class C extends P{

    @Override
    public void marriage() {
        System.out.println("Child method : Radha");
    }
}
public class Test {

    public static void main(String[] args) {

        P p = new P();
        p.marriage();  // Parent method : Appalaamma | Subbalakshmi

        C c = new C();
        c.marriage();  // Child method : Radha

        P pc = new C(); // when we compile the code then compiler checks marriage() method present in parent.
                        // And in case if marriage() method is Override in child class then compiler run child method...

        pc.marriage(); // Child method : Radha


    }
}
