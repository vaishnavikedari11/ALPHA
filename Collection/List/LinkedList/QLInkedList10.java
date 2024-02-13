//remove a loop /cycle in ll
public class QLInkedList10 {
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

   
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow !=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //emove cycle-last.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
