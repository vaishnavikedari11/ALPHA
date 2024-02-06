//friends pairing problem
public class MRecursion13 {
    public static int pairingFriends(int n) {
        //base case
        if(n==1 || n==2){
            return n;
        }
        //work

        // //choice
        // int fnm1=pairingFriends(n-1);
        // //pair
        // int fnm2=pairingFriends(n-2);
        // int pairWays=(n-1)*fnm2;
        // //totalways
        // int totalWays=fnm1+pairWays;
        // return totalWays;

        return pairingFriends(n-1)+(n-1)*pairingFriends(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(pairingFriends(3));
    }
}
