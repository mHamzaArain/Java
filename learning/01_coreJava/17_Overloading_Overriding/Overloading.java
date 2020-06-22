/**
 * Overloading: Same name of diff. signatuture(diff. no. args)
 * ============================================================
 * It is allowed in Parent & child class to inherit them.
 */

class Parent {
    public void Overload(int a) { System.out.println("Parent: 1 func"); }
    public void Overload(int a, int b) { System.out.println("Parent: 2 func"); }
}

class Child extends Parent {
    public void Overload(int a, int b, int c) { System.out.println("Child: 1 func"); }
    public void Overload(int a, int b, int c, int d) { System.out.println("Child: 2 func"); }
}

public class Overloading 
{
    public static void main(String[] args){
        Child obj= new Child();
        obj.Overload(1);
        obj.Overload(1, 2);
        obj.Overload(1, 2, 3);
        obj.Overload(1, 2, 3, 4);
    }
}