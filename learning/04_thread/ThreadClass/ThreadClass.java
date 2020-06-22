/**
 * Runnable Interface
 * ===================
 * public interface Runnable {
 *      void run();
 * }
 * 
 * 1. One way to create a thread in java is to implement 
 *    the Runnable Interface & then instanriate an obj.
 *    of the class.
 * 2. We need to override the run() method into our class
 *    which is the only method that needs to be implmented.
 * 3. An obj. of Thread class is created by passing a Runnable
 *    obj. that implements the run() method.
 * 4. The start() method() is invoked on the Thread obj. 
 *    createdin the previous step. The start() method 
 *    returns immidiately after a thread has been sapawn.
 * 5. The thread ends when the run() methodends, either by 
 *    normal completion or by throwing an uncaught exception.
 */


class A extends Thread {
    public void run() {
        int i;
        for(i=0; i< 10; i++)
            System.out.println("Thread A: "+i);
    }
}

class B extends Thread {
    public void run() {
        int i;
        for(i=0; i< 10; i++)
            System.out.println("Thread B: "+i);
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}