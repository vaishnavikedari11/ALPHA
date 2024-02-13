//remove in linked list
public class QLinkedList3 {
    class Node{
        int data;
        Node next;

        //constructor of node
        Node(int data){
            this.data =data;
            this.next=null;
        }
    }
    //as like varible node type
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data); //creation of node
        size++;
        //condtition
        if(head==null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;//
        head=newNode;

    }

    public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("This list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            head=tail=null;
        }
        int value=head.data;
        head=head.next;
        return value;

    }
    //remove last
    public int removeLast(){

        if(size == 0){
            System.out.println("This ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }

        Node previous=head;
        for(int i=0;i<size-2;i++){
            previous=previous.next;
        }
        
        int val=tail.data;
        previous.next=null;
        tail=previous;
        size--;
        return val;
    }

    public static void main(String[] args) {
        QLinkedList3 ll=new QLinkedList3();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.Print();
        ll.removeFirst();
        ll.Print();
        ll.removeLast();
        ll.Print();
        System.out.println("size"+size);
    }
    
}
