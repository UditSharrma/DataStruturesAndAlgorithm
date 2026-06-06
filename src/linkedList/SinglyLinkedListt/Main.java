package linkedList.SinglyLinkedListt;

public class Main {
    public static void main(String[] args) {
        Excecution.SinglyLinkedList list=new Excecution.SinglyLinkedList();
        //2573
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(323);
        list.insertFirst(3323);
        list.insertLast(23);
        list.display();
        System.out.println("  "+list.findIndex(7823));

    }
}