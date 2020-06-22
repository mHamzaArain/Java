public class StaticInit 
{
    private static int k;
    
     /** 
     * Static Initialization block 
     * ============================
     * You ca write multiple initialization blocks. Later
     * JVM compiles it into 1 initialization block.
     * 
     * Note:
     * 1. Static init. block execute when class is init.
     * 2. return key cna't be used.
     * 3. We can't use "this" and "super" keyword.
     * 4. Static initializers may be used to ini. the class variables of the class.
     * 5. It will execute befotre constructtor.
    */

    static {
        System.out.println("Static init. block: k = "+k);
        k = 10;
    }

    public static void main(String[] args) {
        new StaticInit();
    }
}