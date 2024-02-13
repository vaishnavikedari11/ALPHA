import java.util.ArrayList;

//Beautiful ArrayList(MEDIUM) 
//An Arraylist nums of size n is beautiful if:
//nums is a permutation of the integers in the range [1, n]. 
//For every 0 <= i < j < n,
// there is no indexkwithi<k<j where 2*nums.get(k)==nums.get(i)+ nums.get(j).
// Given the integer n,return any beautiful arraylist nums of size n.
//There will be atleast one valid answer for the given n.

public class ParraylistExersize4 {
    public ArrayList<Integer> beautifulList(int n) {

        ArrayList<Integer>res=new ArrayList<>();
        divideConque(1,1,res,n);
        return res;
    }
    private void  divideConque(int start ,int increment,ArrayList<Integer>res,int n) {
        if(start+increment>n){
            res.add(start);
            return;
        }
        divideConque(start, 2*increment, res, n);
        divideConque(start+increment, 2*increment, res, n);
    }
    public static void main(String[] args) {
        int n=4;
        
    }
}
