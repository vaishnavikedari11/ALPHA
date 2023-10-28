//Use the following sorting algorithms tosort an array in DESCENDING order : 
// d. Counting Sort
//You can use this array as an example :[3, 6, 2, 1,8, 7, 4, 5, 3, 1]

public class HSortingExersize4 {
    public static void countingSort(int array[]) {
        int largest = Integer.MIN_VALUE;
        // outer loop for frequency count
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
    

    int count[]=new int[largest +1];
    for(int i = 0;i<array.length;i++){
        count[array[i]]++;
    }
    // sorting
    int j = 0;
    for(int i = count.length-1;i>=0;i--){
        while (count[i] >0) {
            array[j] = i;
            j++;
            count[i]--;
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
        int array[]={3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        countingSort(array);
        printArray(array);

    }
}
