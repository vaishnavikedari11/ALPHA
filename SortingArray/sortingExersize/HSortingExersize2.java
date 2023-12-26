//Use the following sorting algorithms tosort an array in DESCENDING order :
//  b. Selection Sort 
//You can use this array as an example :[3, 6, 2, 1,8, 7, 4, 5, 3, 1]

public class HSortingExersize2 {
    public static void selectionSort(int array[]) {
        // counting turns
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i; // assume minpos is current position
            // finding minposition
            for (int j = i+1; j < array.length; j++) {
                if (array[minpos] < array[j ]) {
                    minpos = j;
                }
            }
            //swapping
            int temp=array[minpos];
            array[minpos]=array[i];
            array[i]=temp;

        }
    }

    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(array);
        printArray(array);
    }

}
