//check if a number is a power of 2 or not
public class KBitManipulation9 {
    public static boolean checkIsPowerOfTwo(int n) {
        return (n &(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(checkIsPowerOfTwo(15));
    }
}
