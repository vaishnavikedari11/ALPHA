import java.util.Arrays;

//inbuilt sort
public class HSorting4 {
    public static void printArrays(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(array);
        printArrays(array);
    }
}
