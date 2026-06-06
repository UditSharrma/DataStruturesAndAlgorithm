package linkedList.DoublyLinkedList;
public class DoublyLinked{

    private Node Head;
    private Node tail;

    int size;
    DoublyLinked(){
        this.size=0;
    }
    public void InsertFirst(int value){
        Node node=new Node( value);
        node.next=Head;
        node.prev=null;
        if (Head!=null){
            Head.prev=node;
        }
        Head=node;
        if (tail==null){
            tail=Head;
        }
        size++;
    }
    public void InsertLast(int val){
       if (tail==null){
           InsertFirst(val);
           return;
       }
       Node node=new Node(val);
       tail.next=node;
       node.prev=tail;
       node.next= null;
        tail=node;
    }
  public void InsertAt(int value ,int  Index) {
      Node temp = Head;
      for (int i = 1; i < Index; i++) {
          temp = temp.next;
      }

      Node node = new Node(value, temp.next, temp);
      if (temp.next != null) {
          temp.next.prev = node;
      }
      temp.next = node;
  }

    public void Display() {
        Node node = Head;
        Node last = null;

        while (node != null) {
            System.out.print(node.value + " ->");
            last = node;
            node = node.next;
        }
        System.out.println("   END---------->"
        );
    }
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next,Node prev){
            this.next=next;
            this.value=value;
            this.prev=prev;
        }
    }
}
