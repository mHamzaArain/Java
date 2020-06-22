/** 
 * String Methods
 * ===============
 * # Case Conversion
 * 1. toUpperCase()
 * 2. toLowerCase()
 * 
 * # indexOf()
 * 1. indexOf(int char)
 * 2. indexOf(int char, int fromIndex)
 * 3. indexOf(String str)
 * 4. indexOf(String str, int fromIndex)
 * 5. lastIndexOf(int char)
 * 6. lastIndexOf(int char, int fromIndex)
 * 7. lastIndexOf(String str)
 * 8. lastIndexOf(String str, int fromIndex)
 * 
 * # Comparing Strings
 * 1. equals(String someString)
 * 2. equalsIgnoreCase(String anotherString)
 * 3. compareTo(String s)
 * 
 * # Substring
 * 1. substring(int beginIndex)
 * 2. substring(int beginIndex, int endIndex)
 */

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Computer");
        String s2 = new String("computer");
        System.out.println(s1);  // Computer

        //// Case conversion:
        // 1. toUpperCase()  
        // 2. toLowerCase()
        s1 = s1.toUpperCase();
        System.out.println(s1);  // COMPUTER
        s1 = s1.toLowerCase();
        System.out.println(s1);  // computer

        //// IndexOf
        int i = s1.indexOf("m");
        System.out.println(i);  // 2
        
        i = s1.indexOf("m", 3);
        System.out.println(i);  // -1 (because m is at 2 index)

        i = s1.indexOf("ute");
        System.out.println(i);  // 4
        
        i = s1.indexOf("ute", 3);  
        System.out.println(i);  // 4

        //// lastIndexOf
        i = s1.lastIndexOf("m");
        System.out.println(i);  // 2
        
        i = s1.lastIndexOf("m", 3);
        System.out.println(i);  // 2 

        i = s1.lastIndexOf("ute");
        System.out.println(i);  // 4
        
        i = s1.lastIndexOf("ute", 3);  
        System.out.println(i);  // -1 (At index 3, it traverse to right to left)

        //// Comparing String
        Boolean b = s1.equals(s2);
        System.out.println(b);      // false

        b = s2.equalsIgnoreCase("COMPUTER");
        System.out.println(b);     // true

        i = s1.compareTo(s2);
        System.out.println(i);   // 32, if int == 0; else not equal.

        //// Substring
        s2 = s1.substring(4);
        System.out.println(s2);  // uter

        s2 = s1.substring(4, 5);
        System.out.println(s2); // u
    }
}