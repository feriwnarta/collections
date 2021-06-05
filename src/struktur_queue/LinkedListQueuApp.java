package struktur_queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueuApp {
    public static void main(String[] args) {
        // bentuk queue dengan implementasi linked list
        Queue<String> linked = new LinkedList<>();
        linked.add("feri");
        linked.add("winarta");
        linked.add("ganteng");
        linked.add("x");
        linked.add("a");
        // sama saja dengan arrayDequeu

        for(String i = linked.poll(); i != null; i = linked.poll()) {
            System.out.println(i);
        }




    }
}
