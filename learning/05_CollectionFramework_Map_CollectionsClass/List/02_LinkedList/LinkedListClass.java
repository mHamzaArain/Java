/**
 * LinkedList
 * ===========
 * All Methods of List applied here.
 */

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        //// constructors
        // 1. LinkedList()
        LinkedList l = new LinkedList();

        // 2. LinkedList(Collection c)

        //// methods of LinkedList
        // 1. void addFirst(Object o)
        l.addFirst("Hamza");

        // 2. void addLast(Object o)
        l.addLast("Hanif");

        // 3. Object getFirst()
        System.out.println(l.getFirst());  // Hamza

        // 4. Object getlast()
        System.out.println(l.getLast());  // Hanif

        // 5. Object removeFirst()
        l.removeFirst();
        System.out.println(l);  // [Hanif]

        // 6. Object removeLast() 
        l.removeLast();
        System.out.println(l);  // []

        // 7. Object clone()
        LinkedList l2 = new LinkedList(); 
        l2 = (LinkedList) l.clone();
        System.out.println(l2);  // []
    }
}