// TOWER OF HANOI(Important!)

public class MRecursionExersize5 {
    public static void towerOfHanoi(int n,String src,String helper,String dest) {
        //base case
        if(n==1){
            System.out.println("transfer disk "+n+"from"+src+"to"+dest);
            return;
        }
        //work
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest,helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
