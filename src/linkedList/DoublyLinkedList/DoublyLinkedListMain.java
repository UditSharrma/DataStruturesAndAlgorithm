package linkedList.DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinked list=new DoublyLinked();
        list.InsertLast(43);
        list.InsertLast(243);
        list.InsertLast(6433);
        list.InsertLast(34);
        list.InsertLast(443);
        list.InsertLast(73);
        list.InsertLast(34);
        list.InsertAt(67,4);
        list.Display();
    }
}