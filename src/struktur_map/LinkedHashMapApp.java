package struktur_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    // sama dengan hashmap
    public static void main(String[] args) {
        Map<String, String> linkedHasMap = new LinkedHashMap<>();
        linkedHasMap.put("a", "a");
        linkedHasMap.put("b", "b");
        linkedHasMap.put("b", "b");

        for(String key : linkedHasMap.keySet()) {
            System.out.println(key);
        }


    }
}
