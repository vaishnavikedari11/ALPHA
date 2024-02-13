import java.util.ArrayList;
//Lonely Numbers in ArrayList(MEDIUM) You are given an integer arraylist nums.
// A number x is lonely when it appears only once, and no adjacent numbers
// (i.e. x + 1 and x - 1) appear in the arraylist.
//Return all lonely numbers in nums. You may return the answer in any order
import java.util.Collections;

public class PArraylistExersize2 {
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer>list1) {
        Collections.sort(list1);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<list1.size()-1;i++){
            if(list1.get(i-1)+1<list1.get(i) && list1.get(i)+1<list1.get(i+1)){
                list.add(list1.get(i));
            }
        }
        if(list1.size()==1){
            list.add(list1.get(0));
        }if(list1.size()>1){
            if(list1.get(0)+1<list1.get(1)){
                list.add(list1.get(0));
            } if(list1.get(list1.size()-2)+1<list1.get(list1.size()-1)){
                list.add(list1.get(list1.size()-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(6);
        list1.add(5);
        list1.add(8);
        System.out.println(list1);
        System.out.println(lonelyNum(list1));
    }
    
}
