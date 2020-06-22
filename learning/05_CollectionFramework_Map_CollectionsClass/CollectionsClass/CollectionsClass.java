/**
 * Collections Class (Not part of Collection Framework)
 * =====================================================
 * 1. Collections class resides inutil package.
 * 2. The class consists exclusively of static
 *      methods that operate on or return collections.
 */


import java.util.Collections;
import java.util.Vector;
import java.util.Arrays;

public class CollectionsClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(13);
        v.add(11);
        v.add(20);
        
        System.out.println(v);  // [13, 11, 20]
        
        // Methods of Coleections
        // 1. public static void sort(List list);
        // 2. public static void sort(List list, Comperator c);
        Collections.sort(v);
        System.out.println(v);  // [11, 13, 20]

        // 3. public static int binarySearch(List list, T key);
        // 4. public static int binarySearch(List list, T key, Comperator c); 
        int bs = Collections.binarySearch(v, 11);
        System.out.println(bs);  // 0

        // 5. public static void reverse(List list);
        Collections.reverse(v);
        System.out.println(v);  // [20, 13, 11]

        // 6. public static void shuffle(List list);
        Collections.shuffle(v);
        System.out.println(v);  // [11, 13, 20]

        // 7. public static void swap(List list, int indexOf, int indexWith);
        Collections.swap(v, 1, 2);  
        System.out.println(v);  // [13, 20, 11]
        
        // 8. public static void copy(List destination, List source);

        // 9. public static T min(Collection c)
        // 10. public static T min(Collection c, Comperator copm)
        int min = Collections.min(v);
        System.out.println(min);  // 11

        // 9. public static T max(Collection c)
        // 10. public static T max(Collection c, Comperator copm)
        int max = Collections.max(v);
        System.out.println(max);  // 20

        //////////////////////////////////////////////////////////////////
        

        // Polymorphic methods in Arrays
        int[] a = {20, 5, 50, 10, 25};
        int[] b = new int[10];

        // Methods of Arrays
        //  Polymorphic version  of sort()
        // 1. public static void sort(int[] a)
        // 2. public static void sort(int[] a, int fromIndex, int toIndex)
        // 3. public static void sort(long[] a)
        // 4. public static void sort(long[] a, int fromIndex, int toIndex)


        for(int item:a)
            System.out.print(item + " ");  // 20 5 50 10 25
        
        System.out.print("\n");
        Arrays.sort(a);
        for(int item:a)
            System.out.print(item + " ");  // 5 10 20 25 50

        //  Polymorphic version  of binarySearch(_,_)
        // 5. public static int binarySearch(Long[] list, long key);
        // 6. public static int binarySearch(long[] list, int fromIndex, int toIndex,long key); 

        // Polymorphic
        // 7. public static boolean equals()int[] a, int[] b)

        // 8. public static void fill(int[] a)
        // 8. public static void fill(int[] a, int fromIndex, int toIndex, int val)
        Arrays.fill(b, 5);

        for(int item:b)
        System.out.print(item + " ");  // 5 5 5 5 5 5 5 5 5 5
    
        System.out.print("\n");
        Arrays.fill(b, 5, 9, 1); // from index 5-9 -> fill 1
        for(int item:b)
            System.out.print(item + " ");  // 5 5 5 5 5 1 1 1 1 5
    }
}