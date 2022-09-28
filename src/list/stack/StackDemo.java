package list.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("c");
        System.out.println(s); // [A, B, c]
        System.out.println(s.search("A")); // 3
        System.out.println(s.search("Zs"));  // -1
    }
}
