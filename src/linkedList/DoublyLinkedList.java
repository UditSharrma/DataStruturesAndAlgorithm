package linkedList;

class DoublyLinkedLList {
    Node head;

    void insertFirst(int price) {
        Node newNode = new Node(price);

        if (head == null) {
            head = newNode;
        }
    }

}
