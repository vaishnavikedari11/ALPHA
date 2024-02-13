//detect loop/cycle in all ll
public class QLinkedList9 {
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
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true;//cycle exist
            }
        }
        return false;//xyxle does not exist
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
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        //head.next.next.next=head;

        System.out.println(isCycle());

    }
}
