package struktur_map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMap {

    // sama dengan hashmap, tetapi keberadaannya lemah dan jika lama tdk digunakan
    // akan terhapus oleh garbage collector
    public static void main(String[] args) {
        Map<String, String> week = new WeakHashMap<>();

    }
}
