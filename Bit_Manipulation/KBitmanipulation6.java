//
public class KBitmanipulation6 {
    public static int  clearIthBit(int n,int i) {
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i,int newBit ) {
        // if(newBit==0){
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n,i);
        // }
        n=clearIthBit(n,i);
        int bitmask=newBit<<i;
        return n| bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));

    }
}
