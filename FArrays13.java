//find the occurenece integer in array
public class FArrays13 {
    public static void findFrequency(int array[], int key) {
        int frequency[] = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // to avoid counting same element again
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }

        }
        System.out.println("_____________________________");
        System.out.println("element | frequency");
        System.out.println("_____________________________");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println("  " + array[i] + "  |  " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 11, 1, 1, 1, 1 };
        int key = 1;
        findFrequency(array, key);
    }
}
