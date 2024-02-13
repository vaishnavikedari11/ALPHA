//recursive search
public class QLinkedList5 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
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
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head, key);

        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        QLinkedList5 ll=new QLinkedList5();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        
    }
}
