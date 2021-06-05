package com.tutorial.collection;

import java.util.*;

public class HashSetApp {
    public static void main(String[] args) {
        // tipenya unik
        // data tidak duplikat / sama
        // penentuan uniknya melalui overide method Haschode()
        // data tidak terurut
        // tdk terurut sesuai data yg masuk di sourcode, bukan sorting

        Set<String> hashSet = new HashSet<>();

        hashSet.add("ayam");
        hashSet.add("babi");
        hashSet.add("kambing");
        // data tidak duplicate
        hashSet.add("ayam");
        hashSet.add("ayam");
        hashSet.add("ayam");
        hashSet.add("ayam");
        hashSet.add("ayam");
        System.out.println(hashSet);

        // immutable
        // hashSet = Collections.unmodifiableSet(hashSet);
        // hashSet.add("bebek");
        // hashSet.add("domba");
        // System.out.println(hashSet);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("ayam");
        linkedSet.add("zebra");
        linkedSet.add("babi");
        linkedSet.add("kambing");

        // linked hasSet, data terurut dan tidak ada value yg duplikat
        // terurut sesuai data yg masuk di sourcode, bukan sorting
        linkedSet.add("ayam");
        linkedSet.add("ayam");
        linkedSet.add("ayam");
        linkedSet.add("ayam");
        linkedSet.add("ayam");
        System.out.println(linkedSet);

        // immutable
        // linkedSet = Collections.unmodifiableSet(linkedSet);
        // linkedSet.add("bebek");
        // linkedSet.add("domba");
        // System.out.println(linkedSet);

        System.out.println();
        Set<Person> personSet = new LinkedHashSet<>();
        personSet.add(new Person("feri"));
        personSet.add(new Person("aeri"));
        personSet.add(new Person("feri"));

        // data tidak unik, terjadi duplikat data
        // karena kelas person belum mengoveride method hashcode
        // lalu jika hashcode sama selanjutnya akan dibandingkan nilaiya dgn method equals
        // equals harus dioveride juga
        // jika sudah maka data akan unik
        for(Person value : personSet){
            System.out.println(value.getName());
        }


    }
}

