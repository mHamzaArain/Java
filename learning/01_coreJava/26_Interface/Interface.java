import java.sql.Time;

/** 
 * Interface 
 * ==========
 * 1. All member of interface are public & abstract & it can't be changed.
 * 2. variable(field) -> public, static & final & necessasry to be filled eith value
 * 3. object of Interface can't be created.
 * 4. Interface does'nt have constructor.
 * 5. Reference variable of interface can be made.
 * 6. Object of interface can;t create but creation of object reference is possible.
 * 7. Object ref. of interface can refer can refer to any its subclass type.
 */


interface Admission {
    void admissionDate();   // public & abstract
    int setAdmissionTime = 1400;  // public, static & final & necessasry to be filled eith value.
}

interface Dropout { void dropoutDate(); }

interface Bailout extends Admission, Dropout { void bailoutDate(); }

class Person {} 

class Student extends Person implements Bailout {
    public void admissionDate() {}
    public void dropoutDate() {}
    public void bailoutDate() {}
    public void func() { }
}

public class Interface 
{
    public static void main(String[] args) {
        // Functions will work
        Student obj = new Student();
        obj.admissionDate();
        obj.dropoutDate();
        obj.bailoutDate();
        obj.func();

        // No other function will work. Cause of
        // reference variable only points to Dropout interface
        Dropout ref = new Student();
        ref.dropoutDate();
        // obj.bailoutDate();  // error
        // obj.func();         // error
    }
}