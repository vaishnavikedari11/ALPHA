import java.util.ArrayList;
//sorting arraylist
import java.util.Collections;

//collections==class
//collection==interface
public class PArraylist6 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);//ascending order
        System.out.println(list);

        //descending order

        Collections.sort(list,Collections.reverseOrder());

        //comparator=function logic
        System.out.println(list);
    }
}
