/**
 * Vector
 * =======
 * 1. Its implemetation class of interface List.
 * 2. Dynamic array used to implement vector.
 * 3. Duplicated are allowed.
 * 4. insertion order is preserved.
 * 5. Null insertion allowed.
 * 6. Hetrogenuous allowed.
 * 7. Methods is synchronized. (Ele one by one approach to siginificant obj.)
 */

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        // Constructors

        // Vector(): Creates a default vector of initial capacity is 10.
        // Vector(int size): Creates a vector whose initial capacity is specified by size.
        // Vector(int size, int incr): Creates a vector whose initial capacity is specified 
        //      by size and increment is specified by incr. It specifies the number of elements 
        //      to allocate each time that a vector is resized upward.
        // Vector(Collection c): Creates a vector that contains the elements of collection c.

        Vector v = new Vector(5, 3);

        //// All methods of List Interface reserved here.
        v.add(2); 
        v.add("geeks"); 
        v.add(2, "forGeeks"); 

        System.out.println(v);  // [2, geeks, forGeeks]
    }
    
}