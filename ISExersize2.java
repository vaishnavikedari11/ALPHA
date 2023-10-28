// Print out the sum of the numbers inthe second row of the “nums” array.
// Example : 
//Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }; 
//Output - 18

public class ISExersize2 {
    public static void main(String[] args) {
        int array[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;

        //sum of 2nd row elements
        for(int j=0;j<array[0].length;j++){
            sum+=array[1][j];
        }
        System.out.println("sum is ="+sum);
    }
    
}
