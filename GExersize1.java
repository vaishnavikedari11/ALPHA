//Given an integer array nums, return true if any value appears at least twice in the   array,
// and return false if every element is distinct

//brute force
public class GExersize1 {
    public static boolean checkSame(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int numbers[]={3,2,1,2};
        int numbers[] = { 4, 2, 3, 5 };
        System.out.println(checkSame(numbers));
    }
}
