import java.util.Arrays;

//write program to sort given array
public class FArrays11 {        
        
    
    public static void main(String[] args) {
        int array[]={1,5,3,2};
        Arrays.sort(array);
        System.out.println("sorted array");

        //printing array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
