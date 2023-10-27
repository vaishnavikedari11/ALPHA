//find largeast number in given array
public class FArrays3 {
    public static int largestNumber(int numbers[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,7,9,20};
        
        System.out.println("largest "+largestNumber(numbers));
    }
}
