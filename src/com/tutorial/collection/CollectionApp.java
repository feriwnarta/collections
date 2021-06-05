package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        // .add() -> menambahkan nilai kedalam collection
        collection.add("feri");
        collection.add("winarta");
        collection.add("keren");
        System.out.println("Collection 1");
        for(String value : collection) {
            System.out.print(value + " ");
        }

        Collection<String> collection1 = new ArrayList<>();
        collection1.addAll(collection);
        collection1.add("versi 2");
        System.out.println("\n\nCollection 2");
        for(String value : collection1) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nMenggunakan method contains");
        System.out.println(collection1.contains("winarta"));

        System.out.println("Clear"); // menghapus seluruh elemen dalam collection
        collection1.clear();

        if(collection1.isEmpty()) {
            System.out.println(collection1.size());
            System.out.println("kosong");
        } else {
            System.out.println("ada isinya");
        }
    }
}
