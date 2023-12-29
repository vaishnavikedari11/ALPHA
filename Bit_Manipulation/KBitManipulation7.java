//clear last ith bit
public class KBitManipulation7 {
    public static int clearLastIthBit(int n,int i) {
        int bitmask=(~0)<<i;
        return  n& bitmask;
        
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }
}
