package abstraction.basics;

abstract class FoodItem{

    abstract public void foodName();
    abstract public void foodType();
    abstract public void foodPrice();
    abstract public void foodQuantity();
    abstract public void foodTaste();

    static{
        System.out.println("Available in any sweet homes, Restaurants and Hotels...");
    }
}

class Samosa extends FoodItem{

    @Override
    public void foodName() {
        System.out.println("Samosa");
    }

    @Override
    public void foodType() {
        System.out.println("Snacks");
    }

    @Override
    public void foodPrice() {
        System.out.println("10rs");
    }

    @Override
    public void foodQuantity() {
        System.out.println("100 gram");
    }

    @Override
    public void foodTaste() {
        System.out.println("Normal tasty");
    }
}
class Jellebi extends FoodItem{
    @Override
    public void foodName() {
        System.out.println("Jillebi");
    }

    @Override
    public void foodType() {
        System.out.println("Sweet");
    }

    @Override
    public void foodPrice() {
        System.out.println("150rs");
    }

    @Override
    public void foodQuantity() {
        System.out.println("1kg");
    }

    @Override
    public void foodTaste() {
        System.out.println("Sweetness");
    }
}

class WadaPaw extends FoodItem{
    @Override
    public void foodName() {
        System.out.println("WadaPaw");
    }

    @Override
    public void foodType() {
        System.out.println("Snack/Breakfast");
    }

    @Override
    public void foodPrice() {
        System.out.println("10rs");
    }

    @Override
    public void foodQuantity() {
        System.out.println(1);
    }

    @Override
    public void foodTaste() {
        System.out.println("Good");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Samosa samosa1 = new Samosa();
        samosa1.foodName();
        samosa1.foodType();
        samosa1.foodQuantity();
        samosa1.foodPrice();
        samosa1.foodTaste();
        System.out.println("------------------------------");

        Jellebi jellebi1 = new Jellebi();
        jellebi1.foodName();
        jellebi1.foodType();
        jellebi1.foodQuantity();
        jellebi1.foodPrice();
        jellebi1.foodType();

        System.out.println("-----------------------------");
        WadaPaw wadaPaw = new WadaPaw();
        wadaPaw.foodName();
        wadaPaw.foodType();
        wadaPaw.foodQuantity();
        wadaPaw.foodPrice();
        wadaPaw.foodTaste();
    }
}
