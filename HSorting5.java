import java.math.MathContext;

//counting sort
public class HSorting5 {
    public static void countingSort(int array[]) {

        int largest = Integer.MIN_VALUE;
        // outer loop for frequency
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int array[] = { 1,4,1,3,2,4,3,7 };
        countingSort(array);
        printArray(array);
    }
}
