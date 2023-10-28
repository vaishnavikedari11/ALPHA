import javax.swing.text.DefaultStyledDocument;

//bubble sort
public class HSorting1 {
    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) { // loop runs n times
            for (int j = 0; j < array.length - 1 - turn; j++) { // loop runs n-1-turns
                if (array[j] > array[j + 1]) {
                    // swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
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
        int array[] = { 5, 4, 3, 2, 1 };
        bubbleSort(array);
        printArray(array);
    }
}
