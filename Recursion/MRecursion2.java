//print numbers from n to 1(increasing order)
public class MRecursion2 {
    public static void printIncreasing(int n) {
            //base case
            if(n==1){
                System.out.println(n);
                return;
            }
        printIncreasing(n-1);
        System.out.println(n+" ");

    }
    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }
}
