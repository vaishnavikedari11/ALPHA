//Tilling problem

public class MRecursion11 {
    public static int tilingProblem(int n) {
        //2*n floor size
        //base case
        if(n==0 || n==1){
            return 1;
        }
         //work

        //vertical choice
        int fm1=tilingProblem(n-1);
        //vertical choicee
        int fm2=tilingProblem(n-2);

        int totalWays=fm1+fm2;
        return totalWays;
        
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
