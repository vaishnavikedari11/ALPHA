//Use the following sorting algorithms tosort an array in DESCENDING order : 
//a. Bubble Sort
//You can use this array as an example :[3, 6, 2, 1,8, 7, 4, 5, 3, 1]

public class HSortingExersize1 {
    public static void bubbleSort(int array[]) {
        for(int turn=0;turn<array.length-1;turn++){           // runs n times 
            for(int j=0;j<array.length-1-turn;j++){                //n-1-turns times run
                if(array[j]<array[j+1]){

                    //swapping
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        
    }
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(array);
        printArray(array);
    }
    
}
