import java.util.ArrayList;

//Monotonic ArrayList(EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing
// if for all i <= j, nums.get(i) <= nums.get(j). 
//An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic,
// or false otherwise.

public class PArraylistExersize1 {
    public static boolean monotonicList(ArrayList<Integer> list) {
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < list.size()-1; i++) {
                // arrayl;ist nums is monotone increasing i<=j
                if (list.get(i)>list.get(i+1)) {
                    inc =false;
                //arraylist nums is monotone decreasing i<=j,
                }else if(list.get(i)<list.get(i+1)){
                    dec =false;
                }
            }
        
        return inc||dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        System.out.println(list);
        System.out.println(monotonicList(list));
    }
}
