public class Box
{
    private int l, b, h;  // These only accessible in this class

    // Constructor
    // Constructor provided by compiler implicitly but it's empty.
    //  If no parameter constructor made. 
    // public Box() { }


    // Overloading by pre-provided args. 
    public Box() { l=1; b=1; h=1; }

    public Box(int L, int B, int H)
    { l=L; b=B; h=H; }

    public static void main(String[] args){
        // Calling constructor at the time of its init.
        Box b1 = new Box();
        Box b2 = new Box(20, 15, 32);
    }


}