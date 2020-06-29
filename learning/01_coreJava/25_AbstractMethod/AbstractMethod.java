/**
 *  Abstract Method 
 *  ================
 *       Contain no implement decalared by semi colon rahter than block. 
 *  This method must be inside of abstract class.
 * 1. Class having abstract method (declared OR inherited) -> Entire class must be as abstract.
 * 2. It is compulsory that abstract method has to be overriden in child class. 
 * 3. If child class of abstract super class doesnt implement abstract method implies
 *         that child class is also abstract class.
 * 4. In UML, abstract class/method only write in italic.
*/


abstract class Parent {
    abstract void show();

    void showAgain(){

    }
}

abstract class Child extends Parent {

}

class AnotherChild extends Parent {
    // Override inheriated abstract method of parent to use it bys obj.
    // Overriden is compulsory for abstract method in child class
    void show() {  }
}

public class AbstractMethod 
{
    public static void main(String[] args) {
        AnotherChild ac = new AnotherChild();
        ac.show();
    }
}