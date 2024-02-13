import java .util.ArrayList;
//Most Frequent Number following Key(EASY) You are given an integer Arraylist nums.
// You are also given an integerkey,whichispresentin nums.
//For every unique integer target in nums,count the number of times target immediately 
//follows an occurrence of key in nums. In other words, count the number of indices i such that:

public class PArraylistExersize3 {
    public static int FrequentNum(ArrayList<Integer>list,int key) {
        int result[]=new int[1000];
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
                result[list.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key=1;
        System.out.println(list);
        System.out.println(FrequentNum(list, key));

    }
}
