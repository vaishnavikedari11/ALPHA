import java.util.ArrayList;
//adding element ,time complexity O(1)
public class PArraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.add(1,6); //O(n).linear time taken by this

        System.out.println(list1);

        // //Get operation O(1)
        // int element =list1.get(2);
        // System.out.println(element);

        // //remove element O(n)
        // list1.remove(3);
        // System.out.println(list1);

        //set element at index O(n)
        list1.set(2,10);
        System.out.println(list1);

        //contains element O(n)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));

        
    }
}
