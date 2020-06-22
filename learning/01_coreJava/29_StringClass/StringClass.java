/**
 * String Class
 * =============
 * 1. This class resides in java.lang.String class.
 * 2. This class is final.
 * 3. This class is immutable -> Can't chaged on same reference.
 * 4. 2 or more String characters in the same seq. the 
 *      they share the same ref. in memory.
 *      * String str1 = "My name is Bond";
 *      * String str2 = "My name is Bond";
 *      * String str3 = "My name" + "is Bond";
 *      NOTE: All string ref. str1, str2, str3 denote the same obj.
 * 5. Ways to declare class.
 *      String str = new String("My name is bond");
 *      String str = "My name is bond";
 */


public class StringClass {
    public static void main(String[] args) {
        // Both ref. varvables share same memory location.
        String s1 = "Computer";
        String s2 = "Computer";

        // New ref. variable formed.
        String s3 = new String("Computer");

        /// Comparing values & reference variable
        // Ref. variable (memory address) -> true
        System.out.println("Result 1: "+(s1 == s2));
        // Comparing s1 & s2 values 
        System.out.println("Result 2: "+s1.equals(s2));
        // Ref. variable (memory address) -> false
        System.out.println("Result 3: "+(s1 == s3));
        // Comparing s1 & s3 values 
        System.out.println("Result 4: "+s1.equals(s3));
    }
}