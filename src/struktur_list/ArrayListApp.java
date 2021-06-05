package struktur_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListApp {
    public static void main(String[] args) {
        // konstruk array list terdapat parameter initial capacity
        List<String> arrayList = new ArrayList<>();
        arrayList.add("feri");
        arrayList.add("winarta");
        arrayList.add("Keren");
        System.out.println("array list, add biasa");
        for(String value : arrayList){
            System.out.print(value + " ");
        }

        System.out.println("\n\narraylist, berdasarkan penambahan index");
        arrayList.add(0, "gans");
        for(String result : arrayList){
            System.out.print(result + " ");
        }
        System.out.println("\n");

        // add all berdasarkan collection
        Set<String> set = new HashSet<>();
        set.add("wouy2");
        set.add("wouy1");
        System.out.println("arraylist berdasarkan penambahan adall collection");
        arrayList.addAll(set);
        for(String result : arrayList) {
            System.out.print(result + " ");
        }

        // add all berdasarkan parameter collection dan menggunakan index
        System.out.println("\n");
        Set<String> set2 = new HashSet<>();
        set2.add("dari hashset dengan index");
        arrayList.addAll(1, set2);

        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
    }
}
