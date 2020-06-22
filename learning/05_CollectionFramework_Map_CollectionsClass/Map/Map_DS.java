/**
 * Map
 * ===
 * 1. Map is not child interface of Collection framework.
 * 2. Whenever we want to store group of key-value pair, 
 *      we use Map.
 * 3. Key & value both must be objects.
 * 4. Values can repeat but not keys.
 * 5. All map implementation classes should provide two
 *      "standard" constructors:
 *      a) a void(no arg) constructor which creates an empty
 *          map.
 *      b) a constructor with a single argument of type Map, 
 *          & creates a new mp eith the same key-value mappings 
 *          as its argument.
 * 
 * Map.Entry
 * ---------
 * 1. A map entry(key-value pair)
 * 2. Inner Interface of Map.
 * 3. Methods of Entry.
 *      a. public Object getKey();
 *      b. public Object getValue();
 * 
 * HashMap
 * =======
 * 1. A HashMap contains vlaues based on the key.
 * 2. Hash table data structure is used.
 * 3. It contains only unque elements.
 * 4. It may have one mull key & multiple null values.
 *      * Next attempt to enter null as a key, it simply
 *          discard, without any error.
 * 
 * Hashtable
 * ===========
 * 1. This is safe version of HashMap.
 * 2. Unsorted & unordered.
 * 3. Hash Table is the data structure used. 
 * 4. Hashtable does;nt allow null value unlike HashMap
 * 
 * LinkedHashMap
 * ==============
 * 1. Subclass of HashMap.
 * 2. Insertion order is maintained.
 * 3. Slower insertion & deletion.
 * 4. Hybrid data structure is used(Double Linked List, Hash table).
 * 
 * SortedMap
 * =========
 * 1. Child interface of Map.
 * 2. Whenever a group of key-value pairs needs to be
 *      storein some sorted order, we use SortedMap.
 * 3. Sorting logic applies on keys.
 * 
 * Navigable Map
 * =============
 * 1. It's a child interface of SortedMap.
 * 2. Several utility methods ot provide to navigate
 *       inSortedMap.
 * 
 * TreeMap
 * =======
 * 1. It implements NavigableMap(so SortedMap & Mao).
 * 2. Sorteed order is maintained.
 * 3. It's not thread safe.
 * 4. The map is sorted acc. to the natural ordering
 *      of its keys, or by a Comparator provided at 
 *      map creation time, depending on which constructor
 *      used.
 * 5. A Red-Black tree based NvaigableMap implemetation.
 */

// import java.util.HashMap;
import java.util.*;

public class Map_DS {
    public static void  main(String[] args) {
        HashMap hm = new HashMap(); 
        hm.put(null, null);
        hm.put("This", null);
        hm.put(1, "Hawai");
        hm.put(2,"Sammanna");
        hm.put("Hamza", 1);
        System.out.println(hm);  // {null=null, 1=Hawai, 2=Sammanna, This=null, Hamza=1}

        // Lambda Expression method
        // null = null 1 = Hawai 2 = Sammanna This = null Hamza = 1
        hm.forEach((key,value) -> System.out.print(" " +key + " = " + value));  

        System.out.print("\n");
        
        // Iterator method 
        // null = null 1 = Hawai 2 = Sammanna This = null Hamza = 1 
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            System.out.print(" " + pair.getKey() + " = " + pair.getValue());
        }
    }    
}   