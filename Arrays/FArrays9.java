//find minimum and maximum elements in array
public class FArrays9 {
    public static void findMinMax(int array[]) {
        int max=array[0];
        int min=array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                 max=array[i];
            }else if(array[i]<min){
                 min=array[i];
            }
        }
        System.out.println("minimum array element "+min);
        System.out.println("maximum array element "+max);
       
    }
    public static void main(String[] args) {
        int array[]={3,2,1,56,1000,167};
        
        findMinMax(array);
    }
}
