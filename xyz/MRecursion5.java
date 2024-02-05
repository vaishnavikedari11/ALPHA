//print nth fibinacci number
public class MRecursion5 {
    public static int printFibonacci(int n) {
        //base case
        if(n==0 || n==1){
            return n;
       
        }
        //drfining what our function want to do
        int fnm1=printFibonacci(n-1);
        int fnm2=printFibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n= 25;
        System.out.println(printFibonacci(n));
    }
}
