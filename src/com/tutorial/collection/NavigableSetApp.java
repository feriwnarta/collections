package com.tutorial.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        // terurut juga
        // jika ingin banyak mengakses isi collection bisa menggunakan navigable set
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("z");
        navigableSet.add("x");
        navigableSet.add("a");
        navigableSet.add("f");
        System.out.println(navigableSet); // ascemding

        // membalik ururtan collection
        System.out.println(navigableSet.descendingSet()); // descending

        NavigableSet<String> reversed = navigableSet.descendingSet();



    }
}
