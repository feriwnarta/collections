package struktur_dequeu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class ArrayDequeuAPp {
    public static void main(String[] args) {
        // deuque bisa fifo dan lifo (queue, dan stack)
        // implementasi dequeue dengan array

        // contoh dengan queue (fifo)
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("feri");
        deque.addFirst("winarta");
        deque.addFirst("keren");

        // keren winarta feri
        for(String result : deque) {
            System.out.println(result);
        }


        System.out.println(deque.getFirst());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // implementasi secara fifo
        System.out.println("implementasi secara antrian ,fifo");
        for(String result : deque) {
            System.out.print(result + " ");
        }
        System.out.println();


        // implementasi secara lifo, (stack)
        System.out.println("Implementasi secaara tumpukan");
        for(String result = deque.pollLast(); result != null; result = deque.pollLast()) {
            System.out.print(result + " ");
        }
        System.out.println();








    }
}
