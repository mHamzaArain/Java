/**
 * ArrayList
 * ==========
 * 1. ArrryList is defined using dynamic arrays.
 * 2. It's resizeblbe.
 * 3. Duplicates are allowed.
 * 4. Order of elements are preserved.
 * 5. Null insertion is possible.
 * 6. Hetrogenuous objects are allowed.
 * 7. Except TreeSet & TreeMap Hetrogenuous abjects 
 *      are allowed.
 * 8. ArrayList a = new ArrayList();
 *      * Creates an empty ArrayList obj. with default
 *        init.capacity "10" if ArrayList reaches its 
 *        max capacity then a new ArrayList obj. will 
 *        be created with:
 *        New capacity = (currentCapacity*3/2)+1
 *          e.g;
 *          capacity = 10
 *          new capacity = 10* 3/2 + 1 = 16
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class ArrayListClass {
    public static void main(String[] args) {
        ArrayList all = new ArrayList(5);
        ArrayList al = new ArrayList(all);
        
        //// methods of Collection
        // 1. boolean add(Object o);
        all.add("Hamza");

        al.add("rakesh");   // "Rakesh" added 
        al.add(all);        // ArrayList al elements added
        al.add("Hamza");
        al.add("Hanif");
        System.out.println(al);  // [rakesh, [Hamza], Hamza, Hanif]

        // 2. boolean addAll(Collection c);
        al.addAll(0, all);  // elements of ArrayList at 0 added
        System.out.println(al);  // [Hamza, rakesh, [Hamza], Hamza, Hanif]

        // 3. boolean remove(Object o);
        al.remove("rakesh");
        System.out.println(al);  // [Hamza, [Hamza], Hamza, Hanif]

        // 4. boolean removeAll(Collection c);
        al.removeAll(all);
        System.out.println(al);  // [[Hamza], Hanif]

        //10.Iterator<E> iterator()
        Iterator it = al.iterator();
        while(it.hasNext())
            System.out.print(it.next());   // [Hamza]Hanif
            
        // 5. boolean retainAll(Collection c);
        al.retainAll(all);
        System.out.println(al); // []

        // // 6. int size();
        int s = al.size();
        System.out.println(s);  // 0

        // 7. boolean contains(Object o);
        boolean flag = al.contains("Hamza");
        System.out.println(flag);  // false

        // 8. void clear();
        al.clear();
        System.out.println(al);  // []
        
        // 9. boolean isEmpty();
        boolean flag1 = al.isEmpty();
        System.out.println(flag1);  // true
        

        
        //// Methods of ListInterface
        // 1. void add(int index, E elemetn);
        al.add(0, "Hamza");
        al.add(1, "Arain");
        al.add(2, "Hamza");
        al.add(0, "M");
        System.out.println(al);  // [M, Hamza, Arain, Hamza]

        // 2. E set(int index, E elemetn); Replace ele at specified position 
        al.set(1, "F");
        System.out.println(al);  // [M, F, Arain, Hamza]

        // 3. E get(int index)
        Object str = al.get(1);
        System.out.println(str);  // F

        // // 4. int indexOf(Object o)
        int x = al.indexOf("F");
        System.out.println(x);  // 1

        // // 5. int lastIndexOf(Object o) -> If nothing found it will return -1
        int y = al.lastIndexOf("F");
        System.out.println(y);  // 1

        // 6. sublist(int stratIndex, int endIndex)
        // Converting ArrayList into List
        List z = al.subList(0,1);
        System.out.println(z);  // [M]
    }
}