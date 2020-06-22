/**
 * Set
 * ====
 * 1. Set is a child interface of Collection interface.
 * 2. Duplicates are not allowed.
 * 3. Insertion is not preserved.
 * 4. Set interface does'nt contain any new method.
 * 
 * HashSet
 * ========
 * 1. Hash Table is the data structure. 
 * 2. Insetion is not preserved.
 * 3. All obj. are inserted based on hash code.
 * 4. Hetrogenuous objects are not allowed.
 * 5. Null values are allowed.
 * 6. Provide efficient searching.
 * 
 * Constructors
 * -------------
 * 1. HashSet()
 *    a. default capacity 16.
 *    b. After 75% HashSet is filled, it grows dynamically.
 *       *Thus fill ratio factor is 0.75.
 * 2. HashSet(int capacity)
 *    a. Load factor is 0.75.
 * 3. HashSet(int capacity, float loadFactor)
 * 4. HashSet(Collection c)
 * 
 * LinkedHashSet 
 * ==============
 * 1. Child class of HashSet.
 * 2. Insertion Order if preserved unlike HashSet.
 * 3. Hash Table and Doubly Linked list both are used
 *      hybrid data structure.
 * 
 * Constructors
 * -------------
 * 1. LinkedHashSet()
 *    a. default capacity 16.
 *    b. After 75% HashSet is filled, it grows dynamically.
 *       *Thus fill ratio factor is 0.75.
 * 2. LinkedHashSet(int capacity)
 *    a. Load factor is 0.75.
 * 3. LinkedHashSet(int capacity, float loadFactor)
 * 4. LinkedHashSet(Collection c)
 */

import java.util.HashSet; 
import java.util.LinkedHashSet;

public class HashSet_LinkedHashSet {
    public static void main(String[] args){
        /// HashSet
        HashSet hs = new HashSet();
        hs.add("One");
        hs.add("Tree");
        hs.add("Two");
        hs.add("One"); // Won't added

        System.out.println(hs); // [One, Tree, Two]

        /// LinkedHashSet
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("One");
        lhs.add("Tree");
        lhs.add("Two");
        lhs.add("One"); // Won't added

        System.out.println(lhs); // [One, Tree, Two]

    }
} 