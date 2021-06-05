package com.tutorial.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        // iterable
        System.out.println("MENGGUNAKAN ITERABLE");
        Iterable<Integer> iterable = List.of(1,2,3,4,5);
        for(Integer value : iterable){
            System.out.println(value);
        }

        // iterator
        // default loop menggunakan iterator sebelum ada foreach
        System.out.println("MENGGUNAKAN ITERATOR");
        Iterator iterator = iterable.iterator();
        while(iterator.hasNext()) {
            Integer hasil = (Integer) iterator.next();
            System.out.println(hasil);
        }






    }
}
