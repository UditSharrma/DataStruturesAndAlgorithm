package linkedList.CircularList;
public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    CircularLinkedList() {
        this.size = 0;
    }

    public void Insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }


    public void display() {
        if (head == null) {
            return;
        }

        Node node = head;

        do {
            System.out.print(node.value + " =>> ");
            node = node.next;
        } while (node != head);
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node node = head;
        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        tail = node;
        tail.next = head;
        size--;
    }


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}