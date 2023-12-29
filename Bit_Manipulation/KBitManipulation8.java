//clear range of bits
public class KBitManipulation8 {
    //n=10011101010011,i=2;j=7
    public static int clearRangeBits(int n,int i,int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1  ;
        int bitmask= a|b;
        return n &bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeBits(10, 2, 7));
    }
}
