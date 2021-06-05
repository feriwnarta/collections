package struktur_queue;

import com.tutorial.collection.Person;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuAPp {
    public static void main(String[] args) {
        // bentuk queue dengan implementasi prioriyQueu, menggunakan array dan didalamnya terurut
        // defuault akan terurut secara ascending, kecil ke besar
        Queue<String> priority = new PriorityQueue<>();
        priority.add("z");
        priority.add("x");
        priority.add("v");
        priority.add("c");
        priority.add("g");
        priority.add("a");
        priority.add("b");
        priority.add("l");

        for(String result = priority.poll(); result != null; result = priority.poll()) {
            System.out.println(result);
        }








    }
}
