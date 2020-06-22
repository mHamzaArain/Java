/**
 * Overriding: Defining method in subclass eith the same signature.
 * ================================================================= 
 */

class Base {
    public void Overriding(int a) { System.out.println("Base"); }
}

class Derived extends Base {
    public void Overriding(int a) { System.out.println("Derived"); }
}

public class Overriding 
{
    public static void main(String[] args) {
        Base b = new Base();
        b.Overriding(1);

        Derived d = new Derived();
        d.Overriding(1);
    }    
}