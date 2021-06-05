package struktur_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapApp {
    public static void main(String[] args) {
        // data unik ditentukan melalui hashcode, dan equals jika sama nanti ditiban
        // yg unik adalah key nya
        Map<String, String> ibuKota = new HashMap<>();
        ibuKota.put("jawa barat", "bandung");
        ibuKota.put("jawa tengah", "jogja");
        ibuKota.put("jawa tengah", "jogasdasdja");
        ibuKota.put("jawa tengah", "jogasdasja");
        ibuKota.put("jawa tengah", "jogasdasdja");
        ibuKota.put("jawa tengah", "jogja");
        ibuKota.put("Bali", "Denpasar");

        // tampil key
        Set<String> keys = ibuKota.keySet();
        for(String key : keys) {
            System.out.println(ibuKota.get(key));
        }

        ibuKota = new HashMap<>();
        ibuKota.put("a", "a");
        ibuKota.put("b", "b");
        ibuKota.put("c", "c");

        for(String key : ibuKota.keySet()) {
            System.out.println(key);
        }




    }
}
