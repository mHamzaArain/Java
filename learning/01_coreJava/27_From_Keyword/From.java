/**
 * Input from Keyword
 * ===================
 * 1. Read input frp, system.in using Scanner class.
 * 2. Scanner is final class.
 * 3. Scanner class is a part of java.util package.
 * 4. Scanner breaks its input into tokens using a delimiter pattern, 
 *      which is bydefault matches whitespace.
 * 5. They resulting tokens may be converted into values of diff.
 *      types using the various next methods.
 * 6. These input taken from buffer which is like array.
 *      taken character by character.
 *      a. next()       // 1 word
 *      b. nextLine()   // Multiple words.
 *      c. nextBoolean()
 *      d. nextByte()
 *      e. nextDouble()
 *      f. nextFlaot()
 *      g. nextInt()
 *      h. nextLong()
 *      i. nextShort()    
 */

import java.util.Scanner; // java.util.*

public class From {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("\nName: " + name + "\nAge: " + age);
    }
}