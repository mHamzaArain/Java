/** Constructor Chaning
 *  =====================
 *  1. Constructor cancall other condtructor of the same class or super class.
 *  2. Constructor call form a constructror must be the first step.(
 *      call should appear in the first line)
 *  3. Such series of invocation of constructors is known as contructor chanining.
 *  4. Firt line of constructor is either super() or this() (Bydefault super())
 *  5. Sonctrucotr newver contains super() & this() both.
*/

class Parent {
    public Parent() 
    { System.out.println("Parent 1");}
}

class Child extends Parent {
    public Child() {
        // We can either write super OR this
        this(4);
        System.out.println("Child 1");
    }

    public Child(int x ) { 
        // super();
        System.out.println("Child 2"); 
    }
}


public class ConstructorChaning 
{
    public static void main(String[] args) { 
        Child obj1 = new Child();
    }
}