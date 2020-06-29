/**
 * final Keyword
 * ==============
 * 1. final class can't be inherit.
 * 2. final method can't be inherit or overrideby child class.
 * 3. final blank varoiable can be set only in constructor.
 * a. final instance variable: 
 * b. final static variable:
 *    ------------------------ 
 *    Bydefault its blank when it's init. Altho; we can declared by 3 ways.
 *      1) Constructor 
 *      2) Instance init. block -> Instance variable | Static init. block -> Static varible
 *      3) At the time of init.(i.e; private final int x = 5; ) 
 *    This can't be altered when init.
 * 
 * 
 *    ----------------------
 *    Bydefault its blank when it's init.
 * 
 * c. final local variable: There values can't be altered.
 * d. final class: This can't be inherit to other class.
 * e. final methods: These can't be overriden.  
 */

public class Final 
{
    private final int x;            // a. final instance variable
    private final static int y=6;   // b. final static variable

    // Ways to use final instance/static variable 
    { x = 5; } // Instance init. block
    static { } // Static init. block
    Final() {} // Contructor
    
    public static void func() { 
        int k;         // local variable(inside variable) = blank value  
        final int l=1; // c. final local variable  This value can't be changed  
    } 
    public static void main(String[] args) {
        Final f = new Final();
    }
}

// d. This class cant be inherit to other class
final class Test { }

// e. final method: This can't be overridden 
class Teach{
    public final void func1() { }  // final method
    public void func2() { }
}

class Exam extends Teach {  
    // public void func1() { }
    public void func2() { }
}


