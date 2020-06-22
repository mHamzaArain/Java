/**  Super Keyword
 *  ===============
 *  Super -> Parent class
 *  this  -> Same class OR child class
*/

class Parent {
    String x;
    public void f1() {}
}

class Child extends Parent {
    String x;

    public void f1() {}

    public void f2() {
        String x;
        
        super.f1();  // Parent class function.
        this.f1();   // Same class function.
        
        super.x = "Parent instance variable";
        this.x = "Child instance variable"; 
        x = "Local variable";
        
        System.out.println(super.x);
        System.out.println(this.x);
        System.out.println(x); 
    } 
}

public class Super 
{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.f1();
        obj.f2();
    }
}