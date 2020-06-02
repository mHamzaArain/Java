/**
 * Define class Box with length, breath & height as
 * member variables. Also define setDimension() & 
 * showDimension() as member functions.
 */


class Box
/**
 *  This class has total 5 members:
 *  3 variables -> properties
 *  2 functions -> methods
 */
{
    private int length, breath, height;

    public void setDimension(int l, int b, int h){
        length=l; breath=b; height=h;
    }

    public void showDimension(){
        System.out.println("L="+length);
        System.out.println("B="+breath);
        System.out.println("H="+height);
    }
}

class ClassesAndObjects
{
    public static void main(String[] args){
        // Java supports only dynamic creating of objects
        Box dabbah = new Box(); // dynamically crreated obj
        dabbah.setDimension(12, 12, 12);
        dabbah.showDimension();  // L=12 B=12 H=12

        // now this variable points new object 
        // previous object remain in garbidge cleaned by garbage collector
        dabbah = new Box();
        
        // Bydefault values initialized with zero
        dabbah.showDimension();  // L=0 B=0 H=0
    }
}