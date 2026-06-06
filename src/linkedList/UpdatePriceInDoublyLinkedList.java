package linkedList;
public class UpdatePriceInDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedLList list = new DoublyLinkedLList();
        list.insertFirst(100);
        list.insertFirst(300);
        list.insertFirst(400);
        list.insertFirst(1300);
        list.insertFirst(1003);
        list.insertFirst(1002);
        list.insertFirst(1030);
        list.insertFirst(1400);

        while (list!=null){
            System.out.println(list);
        }
    }
}

class Node {
    int data_price;
    Node prev;
    Node next;

    Node(int value) {
        data_price = value;
        prev = null;
        next = null;
    }


}
/*
reverse
the Linked list
print Forward
curr=head
while curr!=Null
print curr
Ittrrate to each end
while curr.next!=Null
curr=curr.next

print reverse
while curr!=Null
print curr
curr=curr.prev
*/
/*

 */

