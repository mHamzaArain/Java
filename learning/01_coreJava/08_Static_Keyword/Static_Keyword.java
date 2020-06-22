/**
 * Static Keyword
 * ===============
 * 
 * Static Variable
 * ----------------
 * 1. Static variables are by default init. to its default value. 
 * 2. It has single coopy for whole class & does'nt depend upon obj.
 * 
 * Static Function
 * ----------------
 * 1. Defined inside class.
 * 2. Static function can only access static members of the same class.
 * 3. Static function can be invoked using class name & operator.
 */

class Static
{
    int x;         //Instance variable
    static int y;  // static member variable      
    private int z; // can't be accessed outside of class

    public void func1() {        // Instance member function
        // static int var; // error
    }
    
    public static void func2() {} // static member function

    // Static inner class
    static class Test {
        public static String country="PAKISTAN";
    }
}

public class Static_Keyword
{
    public static void main(String[] args){
        // These both objs. created instance variable twice.
        // Objs. doesn't create static variable as it's only for class
        Static ex1 = new Static();
        Static ex2 = new Static();
        
        // Class name after dot is static member of that class.
        Static.y=3;     // Bydefault it is zero
        Static.func2();

        // Class "Static" has static inner class "Test"
        // having public static variable "country"
        System.out.println(Static.Test.country);
    }
}