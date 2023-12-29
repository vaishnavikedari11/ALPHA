//fast exponentiation
public class KBitManipulation11 {
    public static int fastEsponentiation(int a,int n) {
        int ans=1;
        while(n>0){
            if((n&1)!=0){// check lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(fastEsponentiation(5, 3));
    }
}
//modular exponentiation
