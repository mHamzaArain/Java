/**
 * Nested Class
 * =============
 * 1. Nested class is also member of super class as like methods & variables.
 * 2. The class holde inner class called outer class.
 * 3. Outer class maybe public OR default. Altho; Inner class can be private,
 *      protected, public OR default.
 * 4. Types of inner class:
 *      a. static inner class:
 *          1. Static inner class instance can be created outside the 
 *              the outer class with the following syntax;
 *                  Outer.inner obj = new Outer.inner()
 *          2. static inner class can only access outer static members.
 *      b. non-static inner class:
 *          1. non-static inner class instance can be created outside the 
 *              the outer class with the following syntax;
 *                  Outer out = new Outer();
 *                  Outer.inner obj = out.new inner()
 *          2. non-static inner class can access all outer members.
 * 5. Innerclass compiled as Outer%Inner.class
*/
class Outer {
    static int x;        // static member varable
    int y;               // member varable
    void f1() { }        // member function
    class Inner_meber {} // member class

    // Inner non-static class
    static class Inner_Static {
        void innerStaticFunction() {
            System.out.println("innerStaticFunction()"+x);
        }
    }
    
    // Inner Static class
    // Inner class has authority to access outer member.
    class Inner_NonStatic {
        void innerNonStaticFunction() {
            System.out.println("innerNonStaticFunction()"+y);
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // static class member
        Outer.Inner_Static  obj1 = new Outer.Inner_Static();
        obj1.innerStaticFunction();

        // non-static class member
        Outer out = new Outer();
        Outer.Inner_NonStatic obj2 = out.new Inner_NonStatic();
        obj2.innerNonStaticFunction();
    }
}