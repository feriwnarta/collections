package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImutableList {
        // list itu data tida unik / bisa berisi data duplikat
        // pengaksesan list menggunakan index
        // list default mutable / bisa diubah (tidak tetap)
        // cara agar list menjadi imutable, dengan cara mengakses method Collections.umodifiable list
    public static void main(String[] args) {
        Person person = new Person("feri");
        person.tambahHobies("futsal");
        person.tambahHobies("basket");
        person.tambahHobies("voli");
        System.out.println(person.getName());
        System.out.println(person.getHobbies());

        // ubahHobbies(person.getHobbies()); // proses list tidak immutable
        // System.out.println(person.getHobbies());

        // menggunakan method Collection.unmodifiablelist, membuat list menjadi immutable
        // ubahHobbies(person.getHobbies()); error unsuported

        List<String> empty = new ArrayList<>();
        empty.add("a");
        empty.add("b");
        empty.add("c");
        empty.add("c");
        empty.add("c");
        empty.add("c");
        empty.add("c");
        empty.add("c");
        System.out.println(empty);
        //empty = Collections.emptyList();
        //System.out.println(empty);




    }

    public static void ubahHobbies(List<String> hobi){
        // proses terjadi list mutable
        hobi.add("apapun");
        hobi.add("ditambah");
        hobi.add("diluar kelas");
    }
}

