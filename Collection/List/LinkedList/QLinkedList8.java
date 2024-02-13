//check ll is pallindromeor not
public class QLinkedList8 {
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
        Node newNode=new Node(0);
        size++;
        if(size==0){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    

    //slow fast approach
    public Node findMid(Node head){//as like helper function
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPallindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1-find mid
        Node midNode=findMid(head);
        //step2-reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half
        Node left=head;
        //step3-check 
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.next+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QLinkedList8 ll=new QLinkedList8();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPallindrome());
    }
}
