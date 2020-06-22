/**
 *  Abstract Method 
 *  ================
 *       Contain no implement decalared by semi colon rahter than block. 
 *  This method must be inside of abstract class.
 * 1. Class having abstract method (declared OR inherited) -> Entire class must be as abstract.
*/


abstract class Parent {
    abstract void show();
}

abstract class Child extends Parent {

}

class AnotherChild extends Parent {
    // Override inheriated abstract method of parent to use it bys obj.
    void show() {  }
}

public class AbstractMethod 
{
    public static void main(String[] args) {
        AnotherChild ac = new AnotherChild();
        ac.show();
    }
}