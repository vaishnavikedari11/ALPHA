import java.util.ArrayList;

//pairsum 2
//linear timecomplexity
//find if any pair in a sorted and roatated  arraylist has a target sum
public class Parraylist12 {
    public static boolean pairSum(ArrayList<Integer>list,int target) {
        int pivote=-1;//breaking point
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){//braking point /pibote
                pivote=i;
                break;
            }
        }
        int lp=pivote+1;//smallest
        int rp=pivote;//largest

        while(lp!=rp){
        //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;
        System.out.println(pairSum(list, target));
    }
    
}
