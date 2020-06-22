/**
 * Cursors
 * ========
 * 1. Enumearation: Available for legacy C;asses(i.e; Vector, stack)
 * 2. Iterators: Available for all Collection implemented classes.
 *      Interface Iterator{
 *          boolean hasNext(); // enumeration -> hasMoreElements()
 *          Object next();     // enumeration -> nextElement()
 *          void remove();     // enumeration -> not available
 *      }
 * 
 *       Limitations of Enumeration & Iterators
 *       ---------------------------------------
 *        a. Enumerations & iterators both move in single direction cursors.
 *        b. Only read & (remove in iterators) available.
 *          * Not able to add new abjects.
 *          * Not able to replace new elements.
 *  3. ListIterators: 
 * -------------------
 * a. Listiteratr is a child interface of iterator.
 * b. ListITerator is bi-directional cursor.
 * c. All List implemented classes provide a method called listIterator()
 *      e.g; public ListIteratir listIterator()
 *      public interface ListIterator {
 *          boolean hasNext();  
 *          Object next();
 *          int nextIndex();
 *          boolean hasPrevious();
 *          Object previous();
 *          int previousIndex();
 *          void reomve();
 *          void set(E e);
 *          void add(E e);
 *      }
 */


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cursors {
    public static void main(String[] args) {
        //// 1. Enumearation
        Vector v = new Vector();
        v.add("ONE");
        v.add("TWO");
        v.add("THREE");

        System.out.println(v);  // [ONE, TWO, THREE]

        Enumeration e = v.elements(); // Creates objs
        while(e.hasMoreElements()){
            String s = (String) e.nextElement(); // typecasting; return next ele
            System.out.print(s+ " ");  // ONE TWO THREE
        }

        ///// 2. Iterator
        ArrayList al = new ArrayList();
        
        for(int i=0; i<=10;i++)
            al.add(i);

        System.out.println(al);  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        
        Iterator it = al.iterator();
        while(it.hasNext()) {
            Integer I = (Integer) it.next();
            if (I>3 && I<8)
            it.remove();
        }
        System.out.println(al);  // [0, 1, 2, 3, 8, 9, 10]

        //// 3. LinkedList
        LinkedList l = new LinkedList();
        l.add("Python");
        l.add("C#");
        l.add("Rust");
        l.add("Java");

        System.out.println(l); // [Python, C#, Rust, Java]

        ListIterator lit = l.listIterator();

        while(lit.hasNext()) {
            String s = (String) lit.next();
            if(s.equals("Java"))
                lit.set("Java SE");
            else if(s.equals("Python"))
                lit.add("DS");
            else if(s.equals("Rust"))
                lit.remove();
        }
        System.out.println(l); // [Python, DS, C#, Java SE]
    }        
}