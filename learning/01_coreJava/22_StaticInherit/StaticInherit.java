/**
 * Static Members in Inheritance
 * ==============================
 * 1. Function hiding: parent & child classes having 
 *       same name & signature with static keyword.
 * 2. Overriding function: parent & child classes having 
 *       same name & signature does'nt use static kwyword.
 * 
 * NOTE:
 * -----
 * 1. Methods either static or non-static are inheritance. 
 * 2. Static variable can't be inherit.
 * 3. Compile-time error -> static method hides instance method.
 * 4. Compile-time error -> instance method overrides static.
 */

class Parent {
    static int x = 4;

    public static void f1() { }
    public void f2() { }
} 

class Child extends Parent {
    public static void f1() { } // Function hiding
    public void f2() { }        // Overriding function

    static { x=5; }
}

public class StaticInherit 
{
    public static void main(String[] args) {
        Child.f1();
        System.out.println(Child.x);
    }
}