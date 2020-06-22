/**  
 * Wrapper Class 
 * ============== 
 * 
 * Java is'nt 100% OOP because it has Premitive 
 * data types & these are not objects thus Wrapper 
 * class comes e.g;
 * int  -> Int
 * byte -> Byte....
 * 
 * See image: 04_wrapper_classes.png
 */

public class WrapperClasses
{
    public static void main(String[] args){
        // Static methods
        Integer i1 = Integer.valueOf("10101", 2);
        Double d1  = Double.valueOf("3.14");

        int a    = Integer.parseInt("123");
        double b = Double.parseDouble("13.42");
        
        // Instance method
        int c = i1.intValue();
    }
}
