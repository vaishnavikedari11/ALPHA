//print sum of maximum subarrays
//brute force
public class FSubarrays1 {
    public static void maxSubarraysSum(int numbers[]) {
        int currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        // outer loo
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            // inner loop
            for (int j = i; j <numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    // SubarraysSum
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (Maxsum < currsum) {
                    Maxsum = currsum;
                }
            }
            
        }
        System.out.println("maxsum = " + Maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraysSum(numbers);
    }
}
