/**
 * Abstract Class
 * ===============
 * 1. Abstract classes are declared with the abstract keyword.
 * 2. An abstract class can't be inistantiated.
 * 3. It's usesd to declare common characteristicsof subclass.
 * 4. It can only be used as a superclass for other 
 *    classes that extends the abstract class.
 * 5. It contains fields.
 * 6. You can't create obj of abstract class.
 * 7. But you can create reference variable.
 */

abstract class Parent {

} 

class Child extends Parent {

}

public class AbstractClass 
{
    public static void main(String[] args) {
        // Reference varaible -> obj1
        // obj initialized -> new Child()
        Parent obj1 = new Child();
    }
}