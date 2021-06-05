package com.tutorial.collection;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        // interface sorted set, set yg terurut, ascending / descending
        // jika objek lain yg menjadi elemen disorted set harus mengimpelemntasi interface comparable
        // jika tidak bisa, maka dapat menggunakan comparator, bisa bikin kelas lain, atau menngunakan
        // anonymous class / lambda

        // elemen data menggunakan kelas person, dimana kelas person tidak bisa diakses secara langsuung
        // dan akan menggunakan implementasi comparabel dgn membuat kelas baaru implemen comparabel

        // kelas konkrit treeset
        // contoh menggunakan kelas lain implement comparator
        SortedSet<Person> ascending = new TreeSet<>(new Komparator()); // ascending kecil ke besar
        ascending.add(new Person("zazang"));
        ascending.add(new Person("feri"));
        ascending.add(new Person("winarta"));
        System.out.println("sorted set dengan membuat kelas implementasi komparator dan sorted ascending");
        for(Person data : ascending){
            System.out.print(data.getName() + " ");
        }

        SortedSet<Person> descending = new TreeSet<>(new Komparator().reversed());
        descending.add(new Person("zeri"));
        descending.add(new Person("feri"));
        descending.add(new Person("winarta"));
        System.out.println("\ndescending");
        for(Person data : descending){
            System.out.print(data.getName() + " ");
        }

        Komparator komparator = new Komparator(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        SortedSet<Person> sortedSet = new TreeSet(komparator);
        sortedSet.add(new Person("a"));
        sortedSet.add(new Person("x"));
        sortedSet.add(new Person("b"));
        sortedSet.add(new Person("v"));
        sortedSet.add(new Person("c"));
        System.out.println();
        for(var result : sortedSet){
            System.out.println(result.getName());
        }













    }
}
