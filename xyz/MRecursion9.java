//print x^n
public class MRecursion9 {
    public static int printPower(int x,int n) {
        //base case
        if(n==0){
            return 1;
        }
        //defining what our function wamt to do
        int xnm1=printPower(x, n-1);
        int xn=x*xnm1;
        return xn;
        //return x*printPower(x,n-1);
    }
    public static void main(String[] args) {
       System.out.println(printPower(02, 10));
    }
}
