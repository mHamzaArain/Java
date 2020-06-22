/**
 * SortedSet
 * ==========
 * 1. It's child interface of Set interface.
 * 2. Duplicates are not allowed.
 * 3. Elements are in sorted Order.
 * 4. The main diff. in Set & SortedSet:
 *      Set -> Order is not important
 *      SortedSet -> order is important.
 * 5. Order:
 *  a. Numbers -> Ascending
 *  b. Strings -> Dictionary
 * 
 * NavigableSet
 * =============
 * 1. Child Interface of SortedSet.
 * 2. Provide methods form navigation in sorted listIterator
 *      of elements.
 */

import java.util.TreeSet;

public class SortedSet_NavigableSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("C");
        t.add("D");
        t.add("B");
        t.add("A");

        /// SortedSet
        // 1. String first(): Returns the first (lowest) element currently in this set.
        System.out.println(t.first());  // A

        // 2. String last(): Returns the last (highest) element currently in this set.
        System.out.println(t.last());  // D

        // 3. headSet(E fromElement): Returns a view of the portion of this set whose
        //      elements are less than or equal to fromElement.
        System.out.println(t.headSet("C"));  // [A, B]

        // 4. tailSet(E fromElement): Returns a view of the portion of this set whose
        //      elements are greater than or equal to fromElement.
        System.out.println(t.tailSet("C"));  // [C, D]

        // 5. subSet(fromElement, toElement): Return a view of the portion of this set whose elements range from fromElement,
        //      inclusive, to toElement, exclusive.
        // Parameter
        // ---------
        // fromElement - low endpoint (inclusive) of the returned set
        // toElement - high endpoint (exclusive) of the returned set
        System.out.println(t.subSet("B", "D"));  // [B, C]

        // 7. comparator(): Returns the comparator used to order the elements in
        //     this set, or null if this set uses the natural ordering of its elements.
        System.out.println(t.comparator());  // null


        /// NavigableSet 
        // 1. ceiling(E e): Returns the least element in this set greater than or equal
        //       to the given element, or null if there is no such element.
        System.out.println(t.ceiling("C"));  // C

        // 2. floor(E e): Returns the greatest element in this set less than or equal to
        //       the given element, or null if there is no such element.
        System.out.println(t.floor("A"));   // A

        // 3. E lower(E e): Return the greatest element less than e, or null if there is no such element.
        System.out.println(t.lower("B"));  // A

        // 4. E higher(E e): Returns the least element greater than e, or null if there is no such element.
        System.out.println(t.higher("C"));  // D

        // 5. E pollFirst(): Return the first element, or null if this set is empty.
        System.out.println(t.pollFirst());  // A

        // 6. E pollLast(): Return the last element, or null if this set is empty
        System.out.println(t.pollLast());  // D
    }
}