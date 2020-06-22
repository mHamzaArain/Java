/**
 * TreeSet Class
 * ============== 
 * 1. TreeSet is an implementation class of NavigableSet. 
 * 2. Duplicates are not allowed.
 * 3. Store elements in sone logical order(sorted)
 * 4. Hetrogenuous objects are not allowed.
 *      * When tried ClassCastException generated.
 * 5. Null values are acceptable for empty TreeSet,
 *      for Non empty TreeSet Null isn't acceptable.
 * 
 * Note:
 * -----
 * 1. Default natural sorting order work for.
 *  * Homogenuous objects
 *  * Comparable objects
 * 2. StringBuffer objects are not comparable
 * 3. Strnig class implements Comparable.
 * 
 * Comparable Interface
 * --------------------
 * * Comparable interface belongs to java.lang package.
 * interface Comparable {
 *      int comparaeTo(Object obj);
 * }
 * 
 * compareTo(): o1.comapreTo(o2);
 * -------------------------------
 * 1. Return negative value if o1<o2.
 * 2. Return positive if o1>o2.
 * 3. Return zero if o1 and o2 zero. 
 * 
 * Comparator
 * ----------
 * 1. Comparable is used for default natural sorting order.
 * 2. Comparator is used for custom sorting order.
 * 3. Comparator interface resides in java.util package.
 * 
 * interface Comparator {
 *      int compare(Object obj1, Object obj2);
 *      equals();
 * }
 * 
 * compare & equals
 * --------------------
 * 1. int comapare(Obj ob1, Object ob2);
 *      * Return negative if obj1<obj2.
 *      * Return positive if obj1>obj2.
 *      * Return zero if obj1 == obj2.
 * 2. boolean equals()
 *      * dummy method (implemetation is optional)
 * 
 * Constructor
 * ------------
 * 1. TreeSet(): It is used to construct an empty tree set that will be
 *               sorted in ascending order according to the natural order of the tree set.
 * 2. TreeSet(Collection<? extends E> c): It is used to build a new tree set that contains
 *               the elements of the collection c.
 * 3. TreeSet(Comparator<? super E> comparator): It is used to construct an empty tree set
 *               that will be sorted according to given comparator.
 * 4. TreeSet(SortedSet<E> s): It is used to build a TreeSet that contains the elements
 *               of the given SortedSet.
 */


import java.util.TreeSet;
import java.util.Comparator;
// import java.util.*;

class Book {
    private String title;
    private double price;

    public Book(String Title, double Price) { title=Title; price=Price; }

    public String getTitle() { return(title); }
    public double getPrice() { return(price); }
}

// Custom comparator
class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) { 
        Book bk1 = (Book)o1;
        Book bk2 = (Book)o2;
        
        if(bk1.getPrice()<bk2.getPrice())
            return(-1);
        else 
            return(1);
    }
}

public class TreeClass {
    public static void main(String[] args) {
        Book b1, b2, b3;
        b1 = new Book("Python", 800.00);
        b2 = new Book("Bash", 800.00);
        b3 = new Book("C", 200.00);

        TreeSet ts = new TreeSet(new MyComparator());

        ts.add(b1);
        ts.add(b2);
        ts.add(b3);

        for(Object o: ts){
            Book book = (Book)o;
            System.out.println(book.getTitle() + " " + book.getPrice());
        }
    }
}