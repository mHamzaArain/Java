/**
 * this keyword
 * =============
 * 1. The "this" obj. reference is a local variable in instance member
 *    methods referring the caller obj.
*/

class Gift { 
    public void acceptGift(Object obj) {}
}

class Box {
    private int l, b, h;  // Instance variables

    // * Bydefault instance variables referenced by "this" but it's invisible.
    // * If local variables is same as instance variables(i.e; Inst. variables
    //      access to all members in class) "this" use here to differ it.
    // *  NOTE: local variable has high precedence over inst. variable.
    public void setDim(int l, int b, int x) // Instance member function
    { this.l=l; this.b=b; h=x; }

    public void sendBox() {
        Gift g = new Gift();
        g.acceptGift(this);
    }
}

public class This 
{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDim(1, 2, 3);
        b1.sendBox();    
    }
}