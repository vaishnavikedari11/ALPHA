//print sum of first n  natural numbers
public class MRecursion4 {
    public static int printSumNatural(int n) {
        //base case
        if(n==1){
            return 1;
        }
        //definig what our function want to do
        int snm1=printSumNatural(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printSumNatural(n));
    }
}
