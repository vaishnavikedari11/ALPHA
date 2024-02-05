//find factorial of n
public class MRecursion3 {
    public static int printFactorial(int n) {
        //base case
        if(n==0){
            return 1;
        }
        //defining what our function want to do
        int fnm1=printFactorial(n-1);
        int fn=n*printFactorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n= 5;  
       System.out.println(printFactorial(n));
    }
}
