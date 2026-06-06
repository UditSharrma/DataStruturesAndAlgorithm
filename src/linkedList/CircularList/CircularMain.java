package linkedList.CircularList;

public class CircularMain {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.Insert(33);
        list.Insert(323);
        list.Insert(233);
        list.Insert(3443);
        list.Insert(30);
        list.Insert(93);
        list.Insert(43);
        list.Insert(32);

       list.deleteLast();
        list.display();




    }
}
