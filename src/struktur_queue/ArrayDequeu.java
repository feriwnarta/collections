package struktur_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeu {
    public static void main(String[] args) {
        // bentuk queue dengan implementasi array
        // queueu dengan kelas konkrit arraydequeu
        Queue<String> arrayDequeu = new ArrayDeque<>();
        System.out.println("Mengguanakan method add");
        // add menambahkan dan akan throw error
        arrayDequeu.add("feri");
        arrayDequeu.add("winarta");
        arrayDequeu.add("ganteng");

        for(String result : arrayDequeu){
            System.out.print(result + " ");
        }

        System.out.println("\nMenggunakan method offer");
        arrayDequeu.offer("dan dermawan");
        for(String result : arrayDequeu){
            System.out.print(result + " ");
        }

        // mengambil dan menghapus head (depan) element queue
        System.out.println("\nMenggunakan method remove, akan menghapus element head (depan)");
        arrayDequeu.remove();
        System.out.print(arrayDequeu);
        System.out.println(" " + arrayDequeu.size());

        // menghapus berdasarkan object yg sesuai dalam parameter
        System.out.println("Menghapus element berdasarkan parameter yg diinginkan");
        arrayDequeu.remove("dan dermawan");
        System.out.println(arrayDequeu);

        // arrayDequeu.remove() -> mengambil dan menghapus jika kosong akan throw error

        // method poll akan mengambil dan menghapus element head ( depan ) -> jika kosong tidak throw error, tapi return null
        String element = arrayDequeu.poll();
        System.out.println("element yg dihapus : " + element);
        // element terhapus
        System.out.println(arrayDequeu);

        // arrayDequeu.element(); -> mengambil dan tidak menghapus, jika element kosong akan throw error

        // method peek akan mengambil element head dan tidak menghapusnya - > akan return null jika element kosong
        String element2 = arrayDequeu.peek();
        System.out.println("element yg dipeek : " + element2);
        // element tidak terhapus
        System.out.println(arrayDequeu);

        arrayDequeu.remove();

        arrayDequeu.add("feri");
        arrayDequeu.add("winarta");
        arrayDequeu.add("keren");

        System.out.println("\n\n" + arrayDequeu );
        System.out.println(arrayDequeu.peek()); // tidak menghapus
        System.out.println(arrayDequeu.peek()); // tidak menghapus
        System.out.println(arrayDequeu.peek()); // tidak menghapus
        System.out.println(arrayDequeu.size());
        System.out.println();
        System.out.println(arrayDequeu.poll());
        System.out.println(arrayDequeu.poll());
        System.out.println(arrayDequeu.poll());
        System.out.println(arrayDequeu.size());
        arrayDequeu.poll();
        arrayDequeu.poll();
        // arrayDequeu.remove(); -> akan melempar error jika empty














    }
}
