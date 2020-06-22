/** Generic Class
 * ===============
 */

class Gen <T, U> {
    T i;
    U j;
    public void setT(T i1) { i=i1; }
    public void setU(U i1) { j=i1; }

    public T getT(){ return(i); }
    public U getU(){ return(j); }
}


public class GenericClass {
    public static void main(String[] args) {
        Gen<Integer, String> g1= new Gen<Integer, String>();
        g1.setT(5);
        g1.setU("hamza");

        System.out.println(g1.getT() + " " + g1.getU());
    }   
}