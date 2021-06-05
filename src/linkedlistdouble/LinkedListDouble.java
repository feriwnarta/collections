package linkedlistdouble;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDouble {
    // pointer first, last, temp
    private Node first, last, temp;

    public void insertAwal(int value){
        Node nodeAwal = new Node();
        nodeAwal.setInfo(value);
        nodeAwal.setNext(null);
        nodeAwal.setPrevious(null);
        first = nodeAwal;
        last = nodeAwal;
    }

    public void insertKiri(int value) {
        Node nodeKiri = new Node();
        nodeKiri.setInfo(value);
        nodeKiri.setNext(first);
        nodeKiri.setPrevious(null);
        first.setPrevious(nodeKiri);
        first = nodeKiri;
    }

    public void insertKanan(int value) {
        Node nodeKanan = new Node();
        nodeKanan.setInfo(value);
        nodeKanan.setNext(null);
        nodeKanan.setPrevious(last);
        last.setNext(nodeKanan);
        last = nodeKanan;
    }

    public void insertBefore(int index, int value) {
        Node before = new Node();
        Node current = first;
        before.setInfo(value);

        if(index < getSize() && index != 0) {
            for(int i = 0; i < index; i++) {
                current = current.getNext();
            }
            before.setNext(current);
            before.setPrevious(current.getPrevious());
            current.getPrevious().setNext(before);
            current.setPrevious(before);
        } else if(index == 0) {
            before.setNext(current);
            before.setPrevious(null);
            current.setPrevious(before);
            first = before;
        } else {
            System.out.println("Index Harus dibawah " + getSize());
        }
    }

    public void insertAfter(int index, int value) {
        Node after = new Node();
        after.setInfo(value);
        Node current = first;

        // looping menuju index node
        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }

        after.setNext(current.getNext());
        after.setPrevious(current);
        current.getNext().setPrevious(after);
        current.setNext(after);
    }

    public void deleteDgnIndex(int index) {
        temp = first;
        for(int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
    }

    public void show(){
        Node loop = first;
        while(loop != null) {
            System.out.print(loop.getInfo() + " ");
            loop = loop.getNext();
        }
        System.out.println();
    }

    public int getSize(){
        int count = 0;
        temp = first;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListDouble listDouble = new LinkedListDouble();
        // index menggunaka 0
        listDouble.insertAwal(20);
        listDouble.insertKiri(30);
        listDouble.insertKiri(40);
        listDouble.insertKanan(10);
        listDouble.insertKiri(50);
        listDouble.insertKiri(60);
        listDouble.insertKiri(70);
        listDouble.show();
        listDouble.insertBefore(0,102);
        listDouble.show();
        listDouble.insertAfter(2, 25);
        listDouble.show();
        listDouble.deleteDgnIndex(1);
        listDouble.show();
        listDouble.deleteDgnIndex(2);
        listDouble.show();

    }
}

