import java.math.MathContext;

//Use the following sorting algorithms tosort an array in DESCENDING order : 
//c. Insertion Sort 
//You can use this array as an example :[3, 6, 2, 1,8, 7, 4, 5, 3, 1]

public class HSortingExersize3 {
    public static void insertionSort(int array[]) {
        for(int i=1;i<array.length;i++){
            int current=array[i];
            int previous=i-1;
            //finding current position
            while(previous>= 0 && array[previous]<current){
                array[previous+1]=array[previous];
                previous--;
            }
            //insertion
            array[previous+1]=current;
        }
        
    }
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        insertionSort(array);
        printArray(array);
    }
}
