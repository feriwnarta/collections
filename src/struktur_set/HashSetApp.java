package struktur_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        // element, value tidak boleh duplikat
        // jika duplikat akan ditiban
        // urutan data tidak terjamin
        Set<String> hashSet  = new HashSet<>();
        hashSet.add("Feri");
        hashSet.add("Winarta");
        // data duplikat
        hashSet.add("Feri");
        hashSet.add("Feri");
        hashSet.add("Feri");
        hashSet.add("z");
        hashSet.add("Feri");
        hashSet.add("Keren");
        hashSet.add("Feri");
        hashSet.add("a");

        for(String data : hashSet) {
            System.out.println(data);
        }











    }
}
