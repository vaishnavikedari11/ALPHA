import java.lang.reflect.Array;
import java.util.ArrayList;

//implementation
//multidimentional arraylist

public class PArraylist7 {
    public static void main(String[] args) {
        // ArrayList<Integer>list=new ArrayList<>();//in java ,array will be made,with
        // default size
        // and list will access array .when arralist fill.then it automatically made
        // another double size arraylist.

        // multiDimentional arraylist

        // 2d arraylsit
        // list 1=1 2 3 4m 5,list2=2 4 6 8 10, list 3=3 6 9 12 15

        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currentList = mainList.get(i);
        // for (int j = 0; j < currentList.size(); j++) {
        // System.out.print(currentList.get(j) + " ");
        // }
        // System.out.println();
        // }
        // System.out.println(mainList);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);// 1 2 3 4 5
            list2.add(i * 2);// 2 4 6 8 10
            list3.add(i * 3);// 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        list2.remove(3);
        list2.remove(2);
        System.out.println(mainList);

        // nested loop
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
