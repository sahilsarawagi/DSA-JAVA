import java.util.*;

public class InBuiltExample {

    public static void main(String[] args)
    {
//        Stack<Integer> inBuiltStack= new Stack<>();
//        inBuiltStack.add(88);
//        inBuiltStack.add(77);
//        inBuiltStack.add(84);
//        inBuiltStack.add(85);
//        inBuiltStack.add(83);
//
//        System.out.println(inBuiltStack.pop());
//        System.out.println(inBuiltStack.pop());
//        System.out.println(inBuiltStack.pop());
//        System.out.println(inBuiltStack.pop());
//        System.out.println(inBuiltStack.pop());
//        System.out.println(inBuiltStack.pop());   // Empty stack exception

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(88);
//        queue.add(77);
//        queue.add(84);
//        queue.add(85);
//        queue.add(83);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(7);
        deque.addLast(88);
        deque.remove();
        System.out.println(deque);
    }
}