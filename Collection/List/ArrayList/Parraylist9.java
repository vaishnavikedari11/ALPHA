import java.util.ArrayList;

//for linear complexity-2 pointer approach
//containeer with most water
//for given n lines on x axis use 2 lines to form a container such that it holds maximum water
//height-{1,8,6,2,5,4,8,3,7}
public class Parraylist9 {
    public static int storeWater(ArrayList<Integer>height) {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            //calculate water area
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currentWater=ht*width;
            maxWater=Math.max(maxWater, currentWater);

            //update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

       System.out.println(storeWater(height));
    }
    
}
