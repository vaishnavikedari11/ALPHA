import java.util.LinkedList;
import java.util.Queue;

//move all the negative elements to one side of the array
public class FArrays16 {
    public static void moveNegative(int array[],int n) {
        Queue<Integer>position=new LinkedList<>();
        Queue<Integer>negative=new LinkedList<>();
        for(int x:array){
            if(x<0){
                negative.add(x);
            }else{
                position.add(x);
            }
            int ind=0;
            while(!position.isEmpty()){
                array[ind++]=position.poll();
            }
            while(!negative.isEmpty()){
                array[ind++]=negative.poll();
            }
        }
        
    }
    public static void main(String[] args) {
        int array[]={1,-2,4,-4,5,8,3};
        int n=array.length;
        moveNegative(array, n);
    }
}
