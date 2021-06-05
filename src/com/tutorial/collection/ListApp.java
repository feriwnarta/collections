package com.tutorial.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        // tes array list
        List<String> list = new ArrayList<>(100);
        list.add("feri");
        list.add("Winarta");
        list.add("Keren");
        list.add("dan ganteng");
        list.add("dan bijaksana");

        for(String value : list){
            System.out.print(value + " ");
        }
        System.out.println();
        list.remove(0);
        for(String value : list){
            System.out.print(value + " ");
        }
        boolean isCointains = list.contains("Keren");
        System.out.println("\n" + isCointains);

        // Linked list
        List<Integer> list1 = new LinkedList<>();
        System.out.println("Sebelum add index");
        list1.add(10);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        for(Integer value : list1) {
            System.out.println(value);
        }
        list1.add(1, 20);
        System.out.println("Sesudah add index");
        for(Integer value : list1) {
            System.out.println(value);
        }
    }
}


