package StackAndQueues;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(67);
//        stack.push(637);
//        stack.push(6377);
//        stack.push(6347);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(3);
//        queue.add(8);
//        queue.add(4);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());


        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(45);
        deque.addFirst(43);
        deque.addLast(49);
        deque.removeFirst();

    }
}
