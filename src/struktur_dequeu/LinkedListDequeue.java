package struktur_dequeu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDequeue {
    public static void main(String[] args) {
        // sama saja dengan array dequeu
        // cuman implementasi (bentuk) nya menggunakan linked list
        // dequeu dapat stack dapat queueu

        Deque<String> deque = new LinkedList<>();
        deque.addFirst("Feri");
        deque.addLast("Winarta");
        deque.addLast("Keren");

        System.out.println(deque);

        deque.addFirst("wouy");
        System.out.println(deque);


    }
}
