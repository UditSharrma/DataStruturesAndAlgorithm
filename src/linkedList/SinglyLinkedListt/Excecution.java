package linkedList;

public class Excecution {
    public static void main(String[] args) {

        LL list=new LL();
        list.InsertFirst(33);
        list.display();
        list.InsertEnd(43);
        list.display();
        list.InsertFirst(333);
        list.InsertFirst(332);
        list.InsertFirst(3343);
        list.InsertFirst(333233);
        list.display();
        System.out.println(list.findIndex(43));


    }
}
