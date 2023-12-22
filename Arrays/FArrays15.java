import java.util.ArrayList;

//subarrays with given sum
public class FArrays15 {
    public static ArrayList<Integer> subarrayAum(int array[],int n,int s){
        int start=0;
        int last=0;
        boolean flag=false;
        int currentSum=0;
        ArrayList<Integer>res=new ArrayList<>();
        //iterating over the array
        for(int i=0;i<n;i++){
            //sorting sum upto current element
            currentSum+=array[i];
            //checkingb if current sum is greater than equal to given number
            if(currentSum>=s){
                last=i;
                while(s<currentSum && start<last){
                    //substracting element from left =array[start]
                    currentSum=array[start];
                    ++start;
                }
                if(currentSum==s){
                    res.add(start+1);
                    res.add(last+1);

                    flag=true;
                    break;
                }
            }
        }

        if(flag==false){
            res.add(-1);
        }
        //returning result
        return res;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,7,5};
        int n=5;
        int s=12;
        System.out.println(subarrayAum(array, n, s));

    }
}
