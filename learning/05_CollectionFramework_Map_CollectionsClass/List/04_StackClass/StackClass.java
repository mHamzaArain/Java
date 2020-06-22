
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Object push(Object element) : Pushes an element on the top of the stack.
        for(int i = 0; i < 5; i++)  
            stack.push(i); 
        System.out.println(stack);  // [0, 1, 2, 3, 4]

        // Object pop() : Removes and returns the top element of the stack. An
        //  ‘EmptyStackException’ exception is thrown if we call pop()
        //  when the invoking stack is empty.
        Integer y = (Integer) stack.pop(); // Explicitly make an integer type
        System.out.println(y); // 4
        System.out.println(stack); // [0, 1, 2, 3]

        // Object peek(): Returns the element on the top of the stack, but does not remove it.
        Integer element = (Integer) stack.peek();
        System.out.println(element); // 3 

        // boolean empty(): It returns true if nothing is on the top of the stack. Else, returns false.
        boolean flag = stack.empty();
        System.out.println(flag);  // false 

        // int search(Object element) : Determine wheather the obj. is exists then then return ele. from top of stack else return -1 
        Integer pos = (Integer) stack.search(element); 
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos);

    }   
}