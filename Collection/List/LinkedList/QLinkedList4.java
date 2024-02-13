//iterative search,search for a key in linked list .return position where it is found
public class QLinkedList4 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(size==0){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int iterativeSearch(int key){
    
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QLinkedList4 ll=new QLinkedList4();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll.iterativeSearch(5));
        ll.Print();

    }

}
