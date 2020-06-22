public class InstanceInit
{
    // member variable
    private int x;

    /** 
     * Instance Initialization block 
     * ==============================
     * You ca write multiple initialization blocks. Later
     * JVM compiles it into 1 initialization block then write
     * them into constructor in the biginning which will execute 
     * first then further code of instructor will execute.
     * 
     * Note:
     * 1. Instance init. block execute when object is created.
     * 2. return key cna't be used.
     * 3. Altho; we can use "this" and "super" keyword.
    */
    {
        System.out.println("Init. block: x = "+x);
        x=5;
    }

    public InstanceInit(){
        System.out.println("Constructor: x = "+x);
    }

    public static void main(String[] args){
        InstanceInit ib = new InstanceInit();
    }
}