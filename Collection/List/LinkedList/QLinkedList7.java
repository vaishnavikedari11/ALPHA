//find and remove nth bode from end
public class QLinkedList7 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

    
    public static void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(size==0){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove friest
            return;
        }
        //sx-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public void print() {
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.next+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QLinkedList7 ll=new QLinkedList7();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();

    }
}
