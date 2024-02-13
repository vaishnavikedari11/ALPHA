//reverse a ll
public class QLinkedList6 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public  static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(size==0){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void reverse (){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        head=prev;

    }
    public  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QLinkedList6 ll=new QLinkedList6();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
