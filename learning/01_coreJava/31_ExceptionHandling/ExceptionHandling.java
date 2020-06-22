/**
 * 1. try/catch block can have multiple catch blocks.
 * 2. try block can either have catch block(s) OR final block OR both.
 * 3. final block is only one.
 * 4. catch blocks can be many.
 * 5. In exception class, try subclass of relavent exception
 *      rather than super class.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            System.out.println("try");
        }
        catch(ArithmeticException e){
            System.out.println("Exception: " + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("final");
        }
    }    
}