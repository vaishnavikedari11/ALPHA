//Selection sort
public class HSorting2 {
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) { // counting turns
            int minPos = i; // assume minposition=current position
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j; // fuinding minimum

                }
            }
            // swapping minimum with current position
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
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
        selectionSort(array);
        printArray(array);
    }
}
