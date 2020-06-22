/**
 * Constrauctors in Inheritance
 * =============================
 * 1. Constrauctors are not inherited by subclass.
 * 2. Sub class 's contructor invokes constructor of super class.
 * 3. Explicit constructor from sub class's constructor can be made using super().
 * 4. "super" -> In sub class constructor that invokes the constructor of the
 *     super class either by using "Spuer" or implicitly.
 * a. Implicit constructor in super class and subclass.
 * b. Implicit constructor in subclass and explicit constructor in super class.
 * c. Implicit constructor in superclass and explicit constructor in subclass.
 * d. Explicit cpnstructor in superclass & subclass. 
*/

class Parent {
    public Parent() { System.out.println("Parent: Cons 1"); }
    public Parent(int x) { System.out.println("Parent: Cons 2"); }
}

class Child extends Parent {
    public Child() { 
        // Bydefault it call constrictor 1 which has no arg if super keyword not explicitly used. 
        super(1);    // Child constructor 2
        System.out.println("Child"); 
    }
} 

public class  Constructor_inInheritance 
{
    public static void main(String[] args) {
        Child obj = new Child();
        // Parent: Cons 2
        // Child
    }
}