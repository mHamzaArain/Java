/**
 * Queue
 * ======
 * 
 * Queue Interface
 * ----------------
 * 1. Child interface of Collection.
 * 2. Null values are not allowed.
 * 3. Duplicate values are allowed.
 * 4. Hetrogenuous elements are allowed.
 * 5. The Queue interface orders the element in 
 *      FIFI(First-In First-Out) manner.
 * 
 * interface Queue {
 *      // Return special value (null OR false)
 *      boolean offer(E e)
 *      E poll()
 *      E peek()
 * 
 *      // Throws exception on fails.
 *      boolean add(E e)
 *      E remove()
 *      E element()
 * }
 * 
 * Priority Queue
 * ===============
 * 1. Implementation class of Queue.
 * 2. The eleents of the priority are natural 
 *    ordering, or by a Comperator provided at 
 *    queue construction time.
 * 3. Null is not allowed.
 * 4. Not thread safe. 
 * 5. Use PriorityBlockingQueue for thread safe.
 * 
 * Constructors
 * -------------
 * PriorityQueue(): Creates a PriorityQueue with the default initial capacity
 *           (11) that orders its elements according to their natural ordering.
 * PriorityQueue(Collection<? extends E> c): Creates a PriorityQueue containing
 *             the elements in the specified collection.
 * PriorityQueue(int initialCapacity): Creates a PriorityQueue with the specified
 *       initial capacity that orders its elements according to their natural ordering.
 * PriorityQueue(int initialCapacity, Comparator<? super E> comparator): Creates a
 *       PriorityQueue with the specified initial capacity that orders its elements
 *       according to the specified comparator.
 *   PriorityQueue(PriorityQueue<? extends E> c): Creates a PriorityQueue containing
 *       the elements in the specified priority queue.
 *   PriorityQueue(SortedSet<? extends E> c): Creates a PriorityQueue containing the
 *        elements in the specified sorted set. 
 */





import java.util.PriorityQueue;

public class Queue_DS {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("A");
        pq.offer("C");
        pq.offer("D");
        pq.offer("B");
        System.out.println(pq);  // [A, B, D, C]
    }
}