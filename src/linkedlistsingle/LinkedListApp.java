package linkedlistsingle;

public class LinkedListApp {
    // pointer
    private Node first, last, current;


    public void insertAwal(int data){
        Node nodeAwal = new Node();
        nodeAwal.info = data;
        nodeAwal.next = null;
        first = nodeAwal;
        last = nodeAwal;
    }

    public void insertKiri(int data){
        Node nodeKiri = new Node();
        nodeKiri.info = data;
        nodeKiri.next = first;
        first = nodeKiri;
    }

    public void insertKanan(int data){
        Node nodeKanan = new Node();
        nodeKanan.info = data;
        nodeKanan.next = null;
        last.next = nodeKanan;
        last = nodeKanan;
    }

    public void insertTengah(int index, int data){
        // jika ingin bisa masuk index 0
        Node nodeTengah = new Node();
        nodeTengah.info = data;
        current = first;

        // looping node untuk menyisipkan data ditengah, tidak boleh 1
        if(index != 0) {
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            nodeTengah.next = current.next;
            current.next = nodeTengah;
        } else {
            Node index0 = new Node();
            index0.info = data;
            index0.next = first;
            first = index0;
        }
    }

    public void insertTengahTanpa0(int index, int data) {
        Node nodeTengah = new Node();
        nodeTengah.info = data;
        current = first;

        // looping node untuk menyisipkan data ditengah, tidak boleh 1
        if(index != 0) {
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            nodeTengah.next = current.next;
            current.next = nodeTengah;
        } else {
            System.out.println("index tidak boleh 0, bisa gunakan insertKiri");
        }
    }

    public void show() {
        Node loop = first;
        while(loop != null){
            System.out.print(loop);
            if(loop.next != null){
                System.out.print(", ");
            }
            loop = loop.next;
        }
        System.out.println();
    }

    public int getSize(){
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void deleteKiri(){
        first = first.next;
    }

    public void deleteKanan(){
        current = first;
        while(current.next.next != null) {
            current = current.next;
        }
        last = current;
        last.next = null;
    }

    public void deleteTengah(int index){
        current = first;
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        LinkedListApp listApp = new LinkedListApp();
        listApp.insertAwal(20);
        listApp.insertKiri(30);
        listApp.insertKiri(40);
        listApp.insertKiri(50);
        listApp.insertKiri(60);
        listApp.insertKiri(70);
        listApp.insertKiri(80);
        listApp.insertKanan(10);
        listApp.insertTengah(0, 100);
        listApp.insertKiri(120);
        listApp.insertKiri(130);
        listApp.insertTengah(0, 150);
        listApp.insertTengahTanpa0(1, 200);
        listApp.show();
        listApp.deleteKiri();
        listApp.show();
        listApp.deleteKiri();
        listApp.show();
        listApp.deleteKanan();
        listApp.show();
        listApp.deleteKanan();
        listApp.show();
        listApp.deleteKanan();
        listApp.show();
        listApp.deleteTengah(1);
        listApp.show();
    }
}
