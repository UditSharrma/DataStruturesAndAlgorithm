package linkedList;

public class LL {
    private Node Head;
    private Node tail;
   private int size;

    public LL(){
       this.size=0;
   }

   public void InsertFirst(int value){
       Node node=new Node(value);
       node.next=Head;
       Head=node;
       if (tail==null){
           tail=Head;
       }
       size++;
   }
   public void display(){
        Node temp=Head;
        while (temp!=null){
            System.out.print(temp.value+" ->");
           temp= temp.next;
        }
       System.out.print(" -> END");
   }
   public void InsertEnd(int value){
        if (tail==null){
            InsertFirst(value);
            return;
        }
       Node node=new Node(value);
        tail.next=node;
        tail=node;
        tail.next=null;
        size++;

   }
   public Node get(int index){
        Node node=Head;
       for (int i = 0; i <index; i++) {
           node=node.next;

       }
       return node;

   }


   public int  deleteFirst(){
        int value= Head.value;
        Head=Head.next;
        if(Head==null){
            tail=null;
        }
        return value;
   }
   public void DeleteLast(){
        if(size<=1){
             deleteFirst();
             return;
        }
        Node secondLast=get(size-2);

        int value= tail.value;
        secondLast.next=tail.next;
        tail=secondLast;
   }

   public void insertAt(int value,int Index){

        Node temp =Head;
        for (int i=1;i<Index;i++){
            temp=temp.next;
        }
       Node node=new Node(value, temp.next);
        temp.next=temp;
        size++;
   }
   public int findIndex(int value){
        int index=0;
        Node node=Head;
       while (node!=null){
           if (node.value==value){
               return index;
           }
           else {
               index++;
               node=node.next;
           }
       }
       return -1;

   }
   private class Node{

       private int value;
       private Node next;

       private Node(int value){
           this.value=value;
       }
       private Node(int value ,Node next){
           this.value=value;
           this.next=next;
       }
   }

}
