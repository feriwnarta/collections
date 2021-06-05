package com.tutorial.collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        Set<String> linked = new LinkedHashSet<>();
        linked.add("feri");
        linked.add("winarta");
        linked.add("gans");
        // tidak bisa duplicate
        // linked.add("feri");
        // linked.add("feri");
        // linked.add("feri");
        System.out.println(linked);

        // imutable linkedHashSet
        linked = Collections.unmodifiableSet(linked);
        System.out.println(linked);
        // linked.add("hai");
    }
}
