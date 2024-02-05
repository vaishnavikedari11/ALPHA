//print x^n in O(logn)
public class MRecursion10 {
    public static int printOptimizedPower(int x,int n ) {
        //basse case
        if(n==0){
            return 1;
        }
        //defining what our function want to do
        int halfpower=printOptimizedPower(x, n/2);
        int halfpowerSq=halfpower*halfpower;
        //n is odd
        if(n%2!=0){
            halfpowerSq=x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(printOptimizedPower(x, n));
    }
}
