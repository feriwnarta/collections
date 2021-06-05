package struktur_set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        // terurut sesuai urutan masuk data
        // bukan sesuai sort ascending atau desceding
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("Feri");
        linkSet.add("winarta");
        linkSet.add("keren");
        linkSet.add("a");
        linkSet.add("x");
        linkSet.add("b");

        for(String data : linkSet) {
            System.out.println(data);
        }




    }
}
