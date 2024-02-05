//print numbers from n to 1(decreasing order)
public class MRecursion1 {
    public static void printDecreasing(int n) {
        //base case 
        if(n==1){
            System.out.println(n);
            return;
        }
        //defining what our function can do
        System.out.println(n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        //calling function
        printDecreasing(n);
    }
}
