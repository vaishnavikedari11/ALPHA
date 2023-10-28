import java.util.concurrent.ForkJoinTask;

//insertion sort
public class HSorting3 {
    public static void insertionSort(int array[]) {

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int previous = i - 1;
            // finding out the current position to insert
            while (previous >= 0 && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous--;
            }
            // insertion
            array[previous + 1] = current;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 3, 2, 1 };
        insertionSort(array);
        printArray(array);
    }
}
