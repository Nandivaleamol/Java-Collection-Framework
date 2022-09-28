package set.hashset.treeSet;

public class ComparatorDemo1 {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));//  -25
        System.out.println("A".compareTo("B"));//  -1
        System.out.println("Z".compareTo("K")); // 15
        System.out.println("A".compareTo("A"));  // 0
        System.out.println("A".compareTo(null)); // RE: NullPointerException

    }
}
