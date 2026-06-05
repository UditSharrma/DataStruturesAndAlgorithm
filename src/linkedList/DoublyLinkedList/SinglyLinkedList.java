package linkedList;

import java.util.LinkedList;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){

        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
           }
           public void insertAt(int value, int index){
             if (index==0){
                 insertFirst(value);
                 return;
             }
             if (index==size){
                 insertLast(value);
                 return;
             }
             Node temp=head;
               for (int i = 1; i <index ; i++) {
                   temp=temp.next;
               }
               Node node =new Node(value,temp.next);
               temp.next=node;
               size++;
           }
    /*
    Display()--------------------------------------------------------------------->
  wrong....  while(head!=null){
    print(head.value);
    head=head.next;// becouse this is changing the structure of the linked lis although in the end the head become the null value
    and the entire structure of the linked list will change and that we can afford becouse if we change the structure we
    can't itrrate again upon that linked list
    ------> now what we do is we make a temp variable that holds the value of the head and ittrate upon the linked list

     */

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  -> ");
            temp=temp.next;

        }
        System.out.print("End");
    }
    // delete------------------------------------------>
    public int  DeleteFirst(){
        int value= head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }
    /*
    the problem with deleting the last node is we have to traverse by loop till the second last index of the array
    so the complexity get O(n) although to get the second last element of the list we use doubly linked list

    One more thing is if we use the doubly linked list we and easily delete , change ,insert at any position in O(1)

     */
    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index; i++) {
            node=node.next;
        }
        return node;

    }
    public int DeleteLast(){
        if (size<=1){
            return DeleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
      tail.next=null;

         return val;
    }
    // this delete the second last element with O(n) complexity
    public int deleteAt(int index){
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    // return Node of the given value
    public Node returnNode(int value){

        Node node = head;

        while(node != null){

            System.out.println("Checking: " + node.value);

            if(node.value == value){
                System.out.println("Found");
                return node;
            }

            node = node.next;
        }

        return null;
    }
    // find index

    public int findIndex(int value){
        int index=0;
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return index;
            }
            else {
                node = node.next;
                index++;
            }
        }
        return -1;
    }
    private class Node{
        private int value;
        private Node next;
        private Node(int value){// head node
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
